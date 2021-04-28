package com.maximo.douglas.oramaapiconsumer.instrumented.funddetailfragment;

import com.maximo.douglas.oramaapiconsumer.R;

import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class FundDetailFragmentVisibilityTest extends FundDetailFragmentTestContext {

    @Test
    public void fragment_fund_detail_container_is_displayed() {
        onView(withId(R.id.fragment_fund_detail_container)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_app_bar_layout_is_displayed() {
        onView(withId(R.id.fragment_fund_detail_app_bar_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_app_bar_title_is_displayed() {
        onView(withId(R.id.fragment_fund_detail_app_bar_title)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_body_linear_layout_is_displayed() {
        onView(withId(R.id.fragment_fund_detail_scrollview)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_manager_logo_image_view_is_displayed() {
        onView(withId(R.id.fragment_fund_detail_body_linear_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_profitability_label_text_view_is_displayed() {
        onView(withId(R.id.fragment_fund_detail_manager_logo_image_view)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_profitability_is_displayed() {
        onView(withId(R.id.fragment_fund_detail_profitability_label_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_volatility_12_months_linear_layout_is_displayed() {
        onView(withId(R.id.fragment_fund_detail_profitability)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_volatility_12_months_label_text_view_is_displayed() {
        onView(withId(R.id.fragment_fund_detail_volatility_12_months_linear_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_volatility_12_months_text_view_is_displayed() {
        onView(withId(R.id.fragment_fund_detail_volatility_12_months_label_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_simplicity_linear_layout_is_displayed() {
        onView(withId(R.id.fragment_fund_detail_volatility_12_months_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_simplicity_label_text_view_is_displayed() {
        onView(withId(R.id.fragment_fund_detail_simplicity_linear_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_simplicity_text_view_is_displayed() {
        onView(withId(R.id.fragment_fund_detail_simplicity_label_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_operability_linear_layout_is_displayed() {
        onView(withId(R.id.fragment_fund_detail_simplicity_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_minimum_initial_application_amount_label_text_view_is_displayed() {
        onView(withId(R.id.fragment_fund_detail_operability_linear_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_minimum_initial_application_amount_text_view_is_displayed() {
        onView(withId(R.id.fragment_fund_detail_minimum_initial_application_amount_label_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_specification_label_text_view_is_displayed() {
        onView(withId(R.id.fragment_fund_detail_minimum_initial_application_amount_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_specification_is_displayed() {
        onView(withId(R.id.fragment_fund_detail_specification_label_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_description_linear_layout_is_displayed() {
        onView(withId(R.id.fragment_fund_detail_specification)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_objective_label_text_view_is_displayed() {
        scrollToView(R.id.fragment_fund_detail_description_linear_layout);
        onView(withId(R.id.fragment_fund_detail_description_linear_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_objective_text_view_is_displayed() {
        scrollToView(R.id.fragment_fund_detail_objective_label_text_view);
        onView(withId(R.id.fragment_fund_detail_objective_label_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_manager_linear_layout_is_displayed() {
        scrollToView(R.id.fragment_fund_detail_objective_text_view);
        onView(withId(R.id.fragment_fund_detail_objective_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_manager_name_label_text_view_is_displayed() {
        scrollToView(R.id.fragment_fund_detail_manager_linear_layout);
        onView(withId(R.id.fragment_fund_detail_manager_linear_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void fragment_fund_detail_manager_description_text_view_is_displayed() {
        scrollToView(R.id.fragment_fund_detail_manager_name_label_text_view);
        onView(withId(R.id.fragment_fund_detail_manager_name_label_text_view)).check(matches(isDisplayed()));
    }
}
