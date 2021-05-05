package com.maximo.douglas.oramaapiconsumer.instrumented.funddetailfragment;

import com.maximo.douglas.oramaapiconsumer.R;

import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class FundDetailFragmentTest extends FundDetailFragmentTestContext {

    @Test
    public void fragment_fund_detail_app_bar_is_correct() {
        onView(withId(R.id.fragment_fund_detail_app_bar_title)).check(matches(withText(SIMPLE_NAME)));
    }

    @Test
    public void fragment_fund_detail_profitability_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_profitability_label_text_view))
                .check(matches(withText(R.string.fund_profitability_label)));
    }

    @Test
    public void fund_profitabilities_day_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_profitabilities_head_line)).perform(click());

        onView(withId(R.id.fund_profitabilities_day_label_text_view))
                .check(matches(withText(R.string.fund_profitability_today_label)));
    }

    @Test
    public void fund_profitabilities_day_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_profitabilities_head_line)).perform(click());

        onView(withId(R.id.fund_profitabilities_day_text_view))
                .check(matches(withText(EXPECTED_DAY)));
    }

    @Test
    public void fund_profitabilities_month_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_profitabilities_head_line)).perform(click());

        onView(withId(R.id.fund_profitabilities_month_label_text_view))
                .check(matches(withText(R.string.fund_profitability_this_month_label)));
    }

    @Test
    public void fund_profitabilities_month_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_profitabilities_head_line)).perform(click());

        onView(withId(R.id.fund_profitabilities_month_text_view))
                .check(matches(withText(EXPECTED_MONTH)));
    }

    @Test
    public void fund_profitabilities_year_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_profitabilities_head_line)).perform(click());

        onView(withId(R.id.fund_profitabilities_year_label_text_view))
                .check(matches(withText(R.string.fund_profitability_this_year_label)));
    }

    @Test
    public void fund_profitabilities_year_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_profitabilities_head_line)).perform(click());

        onView(withId(R.id.fund_profitabilities_year_text_view))
                .check(matches(withText(EXPECTED_YEAR)));
    }

    @Test
    public void fund_profitabilities_m12_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_profitabilities_head_line)).perform(click());

        onView(withId(R.id.fund_profitabilities_m12_label_text_view))
                .check(matches(withText(R.string.fund_profitability_last_twelve_months_label)));
    }

    @Test
    public void fund_profitabilities_m12_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_profitabilities_head_line)).perform(click());

        scrollToView(R.id.fund_profitabilities_m12_text_view);

        onView(withId(R.id.fund_profitabilities_m12_text_view))
                .check(matches(withText(EXPECTED_M12)));
    }

    @Test
    public void fund_profitabilities_m24_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_profitabilities_head_line)).perform(click());

        onView(withId(R.id.fund_profitabilities_m24_label_text_view))
                .check(matches(withText(R.string.fund_profitability_last_two_years_label)));
    }

    @Test
    public void fund_profitabilities_m24_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_profitabilities_head_line)).perform(click());

        scrollToView(R.id.fund_profitabilities_m24_text_view);

        onView(withId(R.id.fund_profitabilities_m24_text_view))
                .check(matches(withText(EXPECTED_M24)));
    }

    @Test
    public void fund_profitabilities_m36_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_profitabilities_head_line)).perform(click());

        onView(withId(R.id.fund_profitabilities_m36_label_text_view))
                .check(matches(withText(R.string.fund_profitability_last_three_years_label)));
    }

    @Test
    public void fund_profitabilities_m36_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_profitabilities_head_line)).perform(click());

        onView(withId(R.id.fund_profitabilities_m36_text_view))
                .check(matches(withText(EXPECTED_M36)));
    }

    @Test
    public void fund_profitabilities_m48_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_profitabilities_head_line)).perform(click());

        onView(withId(R.id.fund_profitabilities_m48_label_text_view))
                .check(matches(withText(R.string.fund_profitability_last_four_years_label)));
    }

    @Test
    public void fund_profitabilities_m48_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_profitabilities_head_line)).perform(click());

        onView(withId(R.id.fund_profitabilities_m48_text_view))
                .check(matches(withText(EXPECTED_M48)));
    }

    @Test
    public void fund_profitabilities_m60_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_profitabilities_head_line)).perform(click());

        onView(withId(R.id.fund_profitabilities_m60_label_text_view))
                .check(matches(withText(R.string.fund_profitability_last_five_years_label)));
    }

    @Test
    public void fund_profitabilities_m60_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_profitabilities_head_line)).perform(click());

        onView(withId(R.id.fund_profitabilities_m60_text_view))
                .check(matches(withText(EXPECTED_M60)));
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
    public void fragment_fund_detail_minimum_initial_application_monetary_unit_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_minimum_initial_application_rs_text_view))
                .check(matches(withText(R.string.fragment_fund_detail_minimum_initial_application_monetary_unity)));
    }

    @Test
    public void fragment_fund_detail_minimum_initial_application_amount_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_minimum_initial_application_amount_text_view))
                .check(matches(withText(MINMIMUM_INITIAL_APPLICATION_AMOUNT)));
    }

    @Test
    public void fragment_fund_detail_specification_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_specification_label_text_view))
                .check(matches(withText(R.string.fund_specification)));
    }

    @Test
    public void fund_specification_main_strategy_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_specification_head_line)).perform(click());

        onView(withId(R.id.fund_specification_main_strategy_label_text_view))
                .check(matches(withText(R.string.fund_main_strategy)));
    }

    @Test
    public void fund_specification_main_strategy_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_specification_head_line)).perform(click());

        onView(withId(R.id.fund_specification_main_strategy_text_view))
                .check(matches(withText(MAIN_STRATEGY_NAME)));
    }

    @Test
    public void fund_specification_suitability_profile_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_specification_head_line)).perform(click());

        onView(withId(R.id.fund_specification_suitability_profile_label_text_view))
                .check(matches(withText(R.string.fund_suitable_profile)));
    }

    @Test
    public void fund_specification_suitability_profile_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_specification_head_line)).perform(click());

        onView(withId(R.id.fund_specification_suitability_profile_text_view))
                .check(matches(withText(SUITABILITY_PROFILE_NAME)));
    }

    @Test
    public void fund_specification_class_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_specification_head_line)).perform(click());

        onView(withId(R.id.fund_specification_class_label_text_view))
                .check(matches(withText(R.string.fund_class)));
    }

    @Test
    public void fund_specification_class_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_specification_head_line)).perform(click());

        onView(withId(R.id.fund_specification_class_text_view))
                .check(matches(withText(FUND_CLASS)));
    }

    @Test
    public void fund_specification_class_anbima_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_specification_head_line)).perform(click());

        scrollToView(R.id.fund_specification_class_anbima_label_text_view);

        onView(withId(R.id.fund_specification_class_anbima_label_text_view))
                .check(matches(withText(R.string.fund_class_anbima)));
    }

    @Test
    public void fund_specification_class_anbima_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_specification_head_line)).perform(click());

        scrollToView(R.id.fund_specification_class_anbima_text_view);

        onView(withId(R.id.fund_specification_class_anbima_text_view))
                .check(matches(withText(FUND_CLASS_ANBIMA)));
    }

    @Test
    public void fragment_fund_detail_objective_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_objective_head_line)).perform(click());

        scrollToView(R.id.fragment_fund_detail_objective_label_text_view);

        onView(withId(R.id.fragment_fund_detail_objective_label_text_view))
                .check(matches(withText(R.string.fund_objective)));
    }

    @Test
    public void fragment_fund_detail_objective_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_objective_head_line)).perform(click());

        scrollToView(R.id.fragment_fund_detail_objective_text_view);

        onView(withId(R.id.fragment_fund_detail_objective_text_view))
                .check(matches(withText(FUND_OBJECTIVE)));
    }

    @Test
    public void fragment_fund_detail_about_the_manager_label_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_manager_head_line)).perform(click());

        scrollToView(R.id.fragment_fund_detail_about_the_manager_label_text_view);

        onView(withId(R.id.fragment_fund_detail_about_the_manager_label_text_view))
                .check(matches(withText(R.string.fragment_fund_detail_about_the_manager_label)));
    }

    @Test
    public void fragment_fund_detail_manager_description_text_view_is_correct() {
        onView(withId(R.id.fragment_fund_detail_manager_head_line)).perform(click());

        scrollToView(R.id.fragment_fund_detail_manager_description_text_view);

        onView(withId(R.id.fragment_fund_detail_manager_description_text_view))
                .check(matches(withText(MANAGER_DESCRIPTION)));
    }
}
