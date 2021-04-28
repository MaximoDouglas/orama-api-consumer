package com.maximo.douglas.oramaapiconsumer.instrumented.funddetailfragment;

import com.maximo.douglas.oramaapiconsumer.R;

import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class FundDetailFragmentValuesTest extends FundDetailFragmentTestContext {

    @Test
    public void fragment_fund_detail_app_bar_title_is_correct() {
        onView(withId(R.id.fragment_fund_detail_app_bar_title)).check(matches(withText(SIMPLE_NAME)));
    }

    @Test
    public void fragment_fund_detail_profitability_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_profitability_label_text_view))
                .check(matches(withText(R.string.fund_profitability_label)));
    }

    @Test
    public void fragment_fund_detail_volatility_12_months_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_volatility_12_months_label_text_view))
                .check(matches(withText(R.string.fund_volatility_12_months)));
    }

    @Test
    public void fragment_fund_detail_volatility_12_months_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_volatility_12_months_text_view))
                .check(matches(withText(EXPECTED_VOLATILITY_12_M)));
    }

    @Test
    public void fragment_fund_detail_simplicity_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_simplicity_label_text_view))
                .check(matches(withText(R.string.fund_detail_simplicity_label)));
    }

    @Test
    public void fragment_fund_detail_simplicity_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_simplicity_text_view))
                .check(matches(withText(EXPECTED_IS_SIMPLE)));
    }

    @Test
    public void fragment_fund_detail_minimum_initial_application_amount_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_minimum_initial_application_amount_label_text_view))
                .check(matches(withText(R.string.fund_minimum_initial_application_amount)));
    }

    @Test
    public void fragment_fund_detail_minimum_initial_application_amount_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_minimum_initial_application_amount_text_view))
                .check(matches(withText(EXPECTED_MINMIMUM_INITIAL_APPLICATION_AMOUNT)));
    }

    @Test
    public void fragment_fund_detail_specification_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_specification_label_text_view))
                .check(matches(withText(R.string.fund_specification)));
    }

    @Test
    public void fragment_fund_detail_objective_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_objective_label_text_view))
                .check(matches(withText(R.string.fund_objective)));
    }

    @Test
    public void fragment_fund_detail_objective_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_objective_text_view))
                .check(matches(withText(FUND_OBJECTIVE)));
    }

    @Test
    public void fragment_fund_detail_manager_name_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_manager_name_label_text_view))
                .check(matches(withText(EXPECTED_MANAGER_NAME_LABEL)));
    }

    @Test
    public void fragment_fund_detail_manager_description_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_manager_description_text_view))
                .check(matches(withText(MANAGER_DESCRIPTION)));
    }
}
