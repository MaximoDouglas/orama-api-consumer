package com.maximo.douglas.oramaapiconsumer.testutils;

import org.jetbrains.annotations.NotNull;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;
import java.util.Objects;

import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static com.maximo.douglas.oramaapiconsumer.testutils.FileUtils.getJsonFromFilePath;
import static com.maximo.douglas.oramaapiconsumer.testutils.ThreadUtils.waitViewToComplete;

public abstract class BaseInstrumentedTesting {

    public abstract void initSetup();

    private final MockWebServer mockWebServer = new MockWebServer();

    @Before
    public void setup() throws IOException {
        startMockWebServer();
        initSetup();
        waitViewToComplete();
    }

    @After
    public void tearDown() throws IOException {
        stopMockWebServer();
    }

    protected void startMockWebServer() throws IOException {
        final String endpointToFunds = "/json/fund_detail_full.json?serializer=fund_detail_full";

        final Dispatcher dispatcher = new Dispatcher() {
            @NotNull
            @Override
            public MockResponse dispatch(@NotNull RecordedRequest request) {
                if (endpointToFunds.equals(Objects.requireNonNull(request.getPath()))) {
                    return new MockResponse()
                            .setResponseCode(200)
                            .setBody(getJsonFromFilePath(
                                    "mockingfiles/fundlistingrequest/fund_listing_response.json"
                            ));
                }

                return new MockResponse().setResponseCode(404);
            }
        };

        mockWebServer.setDispatcher(dispatcher);
        mockWebServer.start(8500);
    }

    protected void stopMockWebServer() throws IOException {
        mockWebServer.close();
    }

    protected void scrollToView(int fund_detail_fragment_objective_text_view) {
        onView(withId(fund_detail_fragment_objective_text_view)).perform(scrollTo());
    }

}
