package com.maximo.douglas.oramaapiconsumer.instrumented.navigation;

import android.app.Activity;

import androidx.test.core.app.ActivityScenario;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import com.maximo.douglas.oramaapiconsumer.MainActivity;
import com.maximo.douglas.oramaapiconsumer.R;
import com.maximo.douglas.oramaapiconsumer.instrumented.BaseInstrumentedTesting;

import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static com.maximo.douglas.oramaapiconsumer.testutils.RecyclerViewMatcher.withRecyclerView;

@RunWith(AndroidJUnit4ClassRunner.class)
public class NavigationTest extends BaseInstrumentedTesting {

    @Override
    public void launchActivity() {
        ActivityScenario.launch(MainActivity.class);
    }

    @Test
    public void test_if_fund_listing_fragment_is_displayed_first() {
        onView(withId(R.id.fund_listing_container)).check(matches(isDisplayed()));
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

}
