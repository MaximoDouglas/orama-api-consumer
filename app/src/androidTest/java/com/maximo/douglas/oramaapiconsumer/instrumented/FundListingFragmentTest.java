package com.maximo.douglas.oramaapiconsumer.instrumented;

import androidx.test.rule.ActivityTestRule;

import com.maximo.douglas.oramaapiconsumer.R;
import com.maximo.douglas.oramaapiconsumer.testutils.BaseInstrumentedTesting;
import com.maximo.douglas.oramaapiconsumer.testutils.FakeActivity;
import com.maximo.douglas.oramaapiconsumer.ui.fundlisting.FundListingFragment;

import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static com.maximo.douglas.oramaapiconsumer.testutils.RecyclerViewMatcher.withRecyclerView;
import static com.maximo.douglas.oramaapiconsumer.testutils.ThreadUtils.waitViewToComplete;

public class FundListingFragmentTest extends BaseInstrumentedTesting {

    private static final int FIRST_ITEM_POSITION = 0;
    private static final String FIRST_ITEM_SIMPLE_NAME = "PIMCO Income Dólar FIC FIM IE";
    private static final String EXPECTED_VOLATILITY_12_M = "18.14%";
    private static final String EXPECTED_MINIMUM_APPLICATION_AMOUNT = "5000.00";

    @Rule
    public ActivityTestRule<FakeActivity> activityRule = new ActivityTestRule<>(FakeActivity.class);

    @Override
    public void initSetup() throws IOException {
        startMockWebServer();
        launchFragmentIntoActivity();
        waitViewToComplete();
    }

    private void launchFragmentIntoActivity() {
        activityRule.getActivity().replaceFragment(FundListingFragment.newInstance());
    }

    @Test
    public void test_if_container_is_displayed() {
        onView(withId(R.id.fund_listing_container)).check(matches(isDisplayed()));
    }

    @Test
    public void test_app_bar_is_set_correctly() {
        onView(withId(R.id.fund_listing_app_bar)).check(matches(isDisplayed()));
        onView(withId(R.id.fund_listing_app_bar_title))
                .check(matches(withText(R.string.fund_listing_toolbar_title)));
    }

    @Test
    public void test_if_recyclerview_is_displayed() {
        onView(withId(R.id.fund_listing_recycler_view))
                .check(matches(isDisplayed()));
    }

    @Test
    public void test_if_first_recyclerview_item_name_is_set_correctly() {
        onView(
                withRecyclerView(R.id.fund_listing_recycler_view)
                        .atPositionOnView(FIRST_ITEM_POSITION, R.id.fund_cardview_data_simple_name_text_view)
        ).check(matches(withText(FIRST_ITEM_SIMPLE_NAME)));
    }

    @Test
    public void test_if_first_recyclerview_item_volatility_value_is_set_correctly() {
        onView(
                withRecyclerView(R.id.fund_listing_recycler_view)
                        .atPositionOnView(FIRST_ITEM_POSITION, R.id.fund_cardview_data_right_half_volatility_value_text_view)
        ).check(matches(withText(EXPECTED_VOLATILITY_12_M)));
    }

    @Test
    public void test_if_first_recyclerview_item_volatility_12m_label_is_set_correctly() {
        onView(
                withRecyclerView(R.id.fund_listing_recycler_view)
                        .atPositionOnView(FIRST_ITEM_POSITION, R.id.fund_cardview_data_right_half_volatility_12m_label_text_view)
        ).check(matches(withText(R.string.fund_volatility_12_month_time_mark)));
    }

    @Test
    public void test_if_first_recyclerview_item_minimum_application_label_is_set_correctly() {
        onView(withRecyclerView(R.id.fund_listing_recycler_view)
                .atPositionOnView(FIRST_ITEM_POSITION, R.id.fund_cardview_data_right_half_minimum_application_amount_label_text_view)
        ).check(matches(withText(R.string.minimum_initial_application_amount)));
    }

    @Test
    public void test_if_first_recyclerview_item_minimum_application_rs_is_set_correctly() {
        onView(withRecyclerView(R.id.fund_listing_recycler_view)
                .atPositionOnView(FIRST_ITEM_POSITION, R.id.fund_cardview_data_right_half_minimum_application_rs_text_view)
        ).check(matches(withText(R.string.fund_cardview_data_right_half_minimum_application_monetary_sign)));
    }

    @Test
    public void test_if_first_recyclerview_item_minimum_application_amount_is_set_correctly() {
        onView(withRecyclerView(R.id.fund_listing_recycler_view)
                .atPositionOnView(FIRST_ITEM_POSITION, R.id.fund_cardview_data_right_half_minimum_application_amount_text_view)
        ).check(matches(withText(EXPECTED_MINIMUM_APPLICATION_AMOUNT)));
    }

}
