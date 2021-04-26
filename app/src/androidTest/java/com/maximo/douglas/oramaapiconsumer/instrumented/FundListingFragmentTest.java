package com.maximo.douglas.oramaapiconsumer.instrumented;

import androidx.test.core.app.ActivityScenario;

import com.maximo.douglas.oramaapiconsumer.MainActivity;
import com.maximo.douglas.oramaapiconsumer.R;
import com.maximo.douglas.oramaapiconsumer.testutils.BaseInstrumentedTesting;

import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static com.maximo.douglas.oramaapiconsumer.testutils.RecyclerViewMatcher.withRecyclerView;

public class FundListingFragmentTest extends BaseInstrumentedTesting {

    private static final String FIRST_ITEM_SIMPLE_NAME = "PIMCO Income Dólar FIC FIM IE";
    private static final String FUND_MINIMUM_APPLICATION_AMOUNT = "R$ 5000,00";
    private static final int FIRST_ITEM_POSITION = 0;

    @Override
    public void initSetup() {
        ActivityScenario.launch(MainActivity.class);
    }

    @Test
    public void test_if_container_is_displayed() {
        onView(withId(R.id.fund_listing_container)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_app_bar_is_displayed() {
        onView(withId(R.id.fund_listing_app_bar)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_app_bar_title_is_set_correctly() {
        onView(withId(R.id.fund_detail_app_bar_title))
                .check(matches(withText(R.string.fund_listing_toolbar_title)));
    }

    @Test
    public void test_if_recyclerview_is_displayed() {
        onView(withId(R.id.fund_listing_recycler_view))
                .check(matches(isDisplayed()));
    }

    @Test
    public void test_if_firs_recyclerview_item_name_is_set_correctly() {
        onView(
                withRecyclerView(R.id.fund_listing_recycler_view)
                        .atPositionOnView(FIRST_ITEM_POSITION, R.id.fund_simple_name_text_view)
        ).check(matches(withText(FIRST_ITEM_SIMPLE_NAME)));
    }

}
