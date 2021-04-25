package com.maximo.douglas.oramaapiconsumer.instrumented;

import androidx.test.core.app.ActivityScenario;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import com.maximo.douglas.oramaapiconsumer.MainActivity;
import com.maximo.douglas.oramaapiconsumer.R;

import org.jetbrains.annotations.NotNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.Objects;

import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static com.maximo.douglas.oramaapiconsumer.testutils.FileUtils.getImageFromFilePath;
import static com.maximo.douglas.oramaapiconsumer.testutils.FileUtils.getJsonFromFilePath;
import static com.maximo.douglas.oramaapiconsumer.testutils.RecyclerViewMatcher.withRecyclerView;
import static com.maximo.douglas.oramaapiconsumer.testutils.ThreadUtils.waitViewToComplete;

@RunWith(AndroidJUnit4ClassRunner.class)
public class NavigationTest {

    private ActivityScenario<MainActivity> activityScenario;
    private final MockWebServer mockWebServer = new MockWebServer();

    @Before
    public void setup() throws IOException {
        setupMockWebServer();
        activityScenario = ActivityScenario.launch(MainActivity.class);
        waitViewToComplete();
    }

    @After
    public void tearDown() throws IOException {
        mockWebServer.close();
        activityScenario.close();
    }

    @Test
    public void test_if_click_on_fund_item_navigate_to_detail_fragment() {
        onView(
                withRecyclerView(R.id.fund_listing_recycler_view).atPositionOnView(
                        0,
                        R.id.fund_card_view_item
                )
        ).perform(click());

        onView(withId(R.id.fund_information)).check(matches(isDisplayed()));
    }

    private void setupMockWebServer() throws IOException {
        final String endpointToFunds = "/json/fund_detail_full.json?serializer=fund_detail_full";
        final String endpointToImage = "/app_img/manager/logo_small/pimco.jpg";

        final Dispatcher dispatcher = new Dispatcher() {
            @NotNull
            @Override
            public MockResponse dispatch(@NotNull RecordedRequest request) {
                switch (Objects.requireNonNull(request.getPath())) {
                    case endpointToFunds:
                        return new MockResponse()
                                .setResponseCode(200)
                                .setBody(getJsonFromFilePath(
                                        "mockingfiles/fundlistingrequest/fund_listing_response.json"
                                ));
                    case endpointToImage:
                        return new MockResponse()
                                .setResponseCode(200)
                                .setHeader("Content-Type", "image/jpg")
                                .setBody(Objects.requireNonNull(getImageFromFilePath(
                                        "mockingfiles/fundmanagerlogo/pimco.jpg"
                                )).getBuffer());
                }
                return new MockResponse().setResponseCode(404);
            }
        };

        mockWebServer.setDispatcher(dispatcher);
        mockWebServer.start(8500);
    }

}
