package com.maximo.douglas.oramaapiconsumer.instrumented.navigation;

import androidx.test.core.app.ActivityScenario;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import com.maximo.douglas.oramaapiconsumer.ui.MainActivity;
import com.maximo.douglas.oramaapiconsumer.R;
import com.maximo.douglas.oramaapiconsumer.testutils.BaseInstrumentedTesting;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static com.maximo.douglas.oramaapiconsumer.testutils.RecyclerViewMatcher.withRecyclerView;
import static com.maximo.douglas.oramaapiconsumer.testutils.ThreadUtils.waitViewToComplete;

@RunWith(AndroidJUnit4ClassRunner.class)
public class NavigationTest extends BaseInstrumentedTesting {

    private static final String FIRST_ITEM_SIMPLE_NAME = "PIMCO Income Dólar FIC FIM IE";
    private static final int FIRST_ITEM_POSITION = 0;

    @Override
    public void initSetup() throws IOException {
        startMockWebServer();
        ActivityScenario.launch(MainActivity.class);
        waitViewToComplete();
    }

    @Test
    public void test_if_fund_listing_fragment_is_displayed_first() {
        onView(withId(R.id.fund_listing_container)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_click_on_fund_item_navigate_to_detail_fragment() {
        onView(
                withRecyclerView(R.id.fund_listing_recycler_view).atPositionOnView(
                        FIRST_ITEM_POSITION,
                        R.id.fund_cardview_data_linear_layout
                )
        ).perform(click());

        onView(withId(R.id.fragment_fund_detail_body_linear_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_passed_as_argument_is_correct() {
        onView(withRecyclerView(
                R.id.fund_listing_recycler_view).atPositionOnView(
                FIRST_ITEM_POSITION, R.id.fund_cardview_data_linear_layout)
        ).perform(click());

        onView(withId(R.id.fragment_fund_detail_app_bar_title)).check(matches(withText(FIRST_ITEM_SIMPLE_NAME)));
    }

}
