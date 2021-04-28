package com.maximo.douglas.oramaapiconsumer.instrumented;

import android.os.Bundle;

import androidx.fragment.app.testing.FragmentScenario;
import androidx.lifecycle.Lifecycle;

import com.maximo.douglas.oramaapiconsumer.R;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Description;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Fund;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.FundManager;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Operability;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Profitabilities;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.specification.FundSuitabilityProfile;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.specification.Specification;
import com.maximo.douglas.oramaapiconsumer.testutils.BaseInstrumentedTesting;
import com.maximo.douglas.oramaapiconsumer.ui.funddetail.FundDetailFragment;

import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class FundDetailFragmentTest extends BaseInstrumentedTesting {

    private static final String FUND_SIMPLE_NAME = "PIMCO Income Dólar FIC FIM IE";

    private static final String FUND_SIMPLICITY = "Não";

    private static final String FUND_MINIMUM_INITIAL_APPLICATION_AMOUNT = "R$ 5000.00";

    private static final String VOLATILITY_12_M = "0.181350";

    private static final String FUND_SUITABILITY_PROFILE_NAME = "Arrojado";

    private static final String FUND_SPECIFICATION_FUND_CLASS = "Multimercado Investimento no Exterior";

    private static final String FUND_SPECIFICATION_FUND_CLASS_ANBIMA = "Fundos que podem investir mais " +
            "de 40% do seu patrimônio líquido em ativos financeiros no exterior.";

    private static final String FUND_OBJECTIVE = "A política de investimento do FUNDO consiste\r\nem " +
            "aplicar, no mínimo, 95% (noventa e cinco por cento)\r\nde seu patrimônio líquido " +
            "em cotas do PIMCO INCOME\r\nDÓLAR FUNDO DE INVESTIMENTO MULTIMERCADO\r\nINVESTIMENTO " +
            "NO EXTERIOR, inscrito no CNPJ nº\r\n32.225.606/0001-11 (“Fundo Master”), administrado " +
            "pelo\r\nADMINISTRADOR e gerido pela GESTORA, cuja\r\npolítica de investimento consiste " +
            "em aplicar os recursos\r\ndos cotistas em instrumentos, valores mobiliários e\r\nativos " +
            "financeiros de diferentes naturezas e\r\ncaracterísticas, de acordo com uma política " +
            "de gestão\r\nde carteira com o objetivo de que visa a obter\r\noportunidades em " +
            "diferentes mercados, baseada em\r\numa sólida análise macroeconômica e " +
            "sujeita às\r\nrestrições descritas no presente Regulamento.";

    private static final String FUND_MANAGER_NAME_LABEL = "Sobre a administradora PIMCO";

    private static final String FUND_MANAGER_NAME = "PIMCO";

    private static final String FUND_MANAGER_DESCRIPTION = "Fundada em 1971, a PIMCO é formada por " +
            "mais de 2.000 profissionais dedicados, em 12 países, compartilhando a mesma missão: " +
            "gerenciar riscos e gerar retorno para nossos clientes. Gerimos investimentos para uma " +
            "ampla variedade de clientes, incluindo fundos de pensão públicos e privados, bem como " +
            "ativos em nome de milhões de pessoas, de todos os extratos sociais, em todo o mundo. " +
            "Somos investidores de longo prazo e líderes de opinião. Nossas perspectivas e soluções " +
            "baseiam-se em um processo de investimento comprovado, que gera visões macroeconômicas " +
            "cíclicas (de curto prazo) e seculares (de três a cinco anos), e que alia essas previsões " +
            "com profundas pesquisas de crédito, análises de capital e gerenciamento de riscos. " +
            "Em 30/Jun/2016 a PIMCO possuía USD 1,51 trilhões de ativos sob gestão.";

    private static final String M60 = null;

    private static final String M48 = null;

    private static final String M24 = "0.571826";

    private static final String M36 = null;

    private static final String MONTH = "-0.023477";

    private static final String M12 = "0.247703";

    private static final String YEAR = "0.060386";

    private static final String DAY = "-0.005200";

    @Override
    public void initSetup() {
        launchFragmentView();
    }

    private void launchFragmentView() {
        Bundle fragmentArgs = new Bundle();
        fragmentArgs.putSerializable("fund", provideFakeFund());

        int themeResId = R.style.Theme_Oramaapiconsumer;
        Lifecycle.State initialState = Lifecycle.State.RESUMED;

        FragmentScenario.Companion.launchInContainer(
                FundDetailFragment.class,
                fragmentArgs,
                themeResId,
                initialState,
                null
        );
    }

    private Fund provideFakeFund() {
        Operability operability = new Operability("5000.00");
        FundSuitabilityProfile fundSuitabilityProfile = new FundSuitabilityProfile(FUND_SUITABILITY_PROFILE_NAME);
        Specification specification = new Specification(
                FUND_MINIMUM_INITIAL_APPLICATION_AMOUNT,
                fundSuitabilityProfile,
                FUND_SPECIFICATION_FUND_CLASS,
                FUND_SPECIFICATION_FUND_CLASS_ANBIMA
        );

        Description description = new Description(FUND_OBJECTIVE);

        Profitabilities profitabilities = new Profitabilities(M60, M48, M24, M36, MONTH, M12, YEAR, DAY);

        FundManager fundManager = new FundManager(
                FUND_MANAGER_DESCRIPTION,
                FUND_MANAGER_NAME
        );

        return new Fund(
                false,
                operability,
                FUND_SIMPLE_NAME,
                specification,
                description,
                VOLATILITY_12_M,
                profitabilities,
                fundManager
        );
    }

    @Test
    public void test_if_fund_detail_fragment_container_is_displayed() {
        onView(withId(R.id.fund_detail_fragment_container)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_specification_fund_class_is_displayed() {
        onView(withId(R.id.fund_specification_fund_class)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_specification_suitability_profile_name_is_displayed() {
        onView(withId(R.id.fund_specification_suitability_profile_name)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_detail_app_bar_title_is_displayed() {
        onView(withId(R.id.fund_detail_app_bar_title)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_detail_app_bar_title_is_corect() {
        onView(withId(R.id.fund_detail_app_bar_title))
                .check(matches(withText(FUND_SIMPLE_NAME)));
    }

    @Test
    public void test_if_fund_detail_fragment_scrollview_is_displayed() {
        onView(withId(R.id.fund_detail_fragment_scrollview)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_information_is_displayed() {
        onView(withId(R.id.fund_information_linear_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_manager_logo_image_view_is_displayed() {
        onView(withId(R.id.fund_manager_logo_image_view)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_profitability_label_text_view_is_displayed() {
        onView(withId(R.id.fund_profitability_label_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_profitability_label_text_view_is_set_correctly() {
        onView(withId(R.id.fund_profitability_label_text_view))
                .check(matches(withText(R.string.fund_profitability_label)));
    }

    @Test
    public void test_if_fund_volatility_12_months_linear_layout_is_displayed() {
        onView(withId(R.id.fund_volatility_12_months_linear_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_volatility_12_months_label_text_view_is_displayed() {
        onView(withId(R.id.fund_volatility_12_months_label_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_volatility_12_months_label_text_view_is_set_correctly() {
        onView(withId(R.id.fund_volatility_12_months_label_text_view))
                .check(matches(withText(R.string.fund_volatility_12_months)));
    }

    @Test
    public void test_if_fund_volatility_12_months_text_view_is_displayed() {
        onView(withId(R.id.fund_volatility_12_months_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_detail_simplicity_linear_layout_is_displayed() {
        onView(withId(R.id.fund_detail_simplicity_linear_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_detail_simplicity_label_text_view_is_displayed() {
        onView(withId(R.id.fund_detail_simplicity_label_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_detail_simplicity_label_text_view_is_correct() {
        onView(withId(R.id.fund_detail_simplicity_label_text_view))
                .check(matches(withText(R.string.fund_detail_simplicity_label)));
    }

    @Test
    public void test_if_fund_detail_simplicity_text_view_is_displayed() {
        onView(withId(R.id.fund_detail_simplicity_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_detail_simplicity_text_view_is_correct() {
        onView(withId(R.id.fund_detail_simplicity_text_view))
                .check(matches(withText(FUND_SIMPLICITY)));
    }

    @Test
    public void test_if_fund_detail_operability_linear_layout_is_displayed() {
        onView(withId(R.id.fund_detail_operability_linear_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_minimum_initial_application_amount_label_text_view_is_displayed() {
        onView(withId(R.id.fund_minimum_initial_application_amount_label_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_minimum_initial_application_amount_label_text_view_is_correct() {
        onView(withId(R.id.fund_minimum_initial_application_amount_label_text_view))
                .check(matches(withText(R.string.fund_minimum_initial_application_amount)));
    }

    @Test
    public void test_if_fund_minimum_initial_application_amount_text_view_is_displayed() {
        onView(withId(R.id.fund_minimum_initial_application_amount_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_minimum_initial_application_amount_text_view_is_correct() {
        onView(withId(R.id.fund_minimum_initial_application_amount_text_view))
                .check(matches(withText(FUND_MINIMUM_INITIAL_APPLICATION_AMOUNT)));
    }

    @Test
    public void test_if_fund_specification_label_text_view_is_displayed() {
        onView(withId(R.id.fund_specification_label_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_specification_label_text_view_is_correct() {
        onView(withId(R.id.fund_specification_label_text_view))
                .check(matches(withText(R.string.fund_specification)));
    }

    @Test
    public void test_if_fund_detail_fragment_description_linear_layout_is_displayed() {
        scrollToView(R.id.fund_detail_fragment_description_linear_layout);

        onView(withId(R.id.fund_detail_fragment_description_linear_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_detail_fragment_objective_label_text_view_is_displayed() {
        scrollToView(R.id.fund_detail_fragment_objective_label_text_view);

        onView(withId(R.id.fund_detail_fragment_objective_label_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_detail_fragment_objective_label_text_view_is_correct() {
        onView(withId(R.id.fund_detail_fragment_objective_label_text_view))
                .check(matches(withText(R.string.fund_objective)));
    }

    @Test
    public void test_if_fund_detail_fragment_objective_text_view_is_displayed() {
        scrollToView(R.id.fund_detail_fragment_objective_text_view);

        onView(withId(R.id.fund_detail_fragment_objective_text_view)).check(matches(isDisplayed()));
    }


    @Test
    public void test_if_fund_detail_fragment_objective_text_view_is_correct() {
        onView(withId(R.id.fund_detail_fragment_objective_text_view))
                .check(matches(withText(FUND_OBJECTIVE)));
    }

    @Test
    public void test_if_fund_detail_fragment_manager_linear_layout_is_displayed() {
        scrollToView(R.id.fund_detail_fragment_manager_linear_layout);

        onView(withId(R.id.fund_detail_fragment_manager_linear_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_detail_fragment_manager_name_label_text_view_is_displayed() {
        scrollToView(R.id.fund_detail_fragment_manager_name_label_text_view);

        onView(withId(R.id.fund_detail_fragment_manager_name_label_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_detail_fragment_manager_name_label_text_view_is_correct() {
        scrollToView(R.id.fund_detail_fragment_manager_name_label_text_view);

        onView(withId(R.id.fund_detail_fragment_manager_name_label_text_view))
                .check(matches(withText(FUND_MANAGER_NAME_LABEL)));
    }

    @Test
    public void test_if_fund_detail_fragment_manager_name_text_view_is_displayed() {
        scrollToView(R.id.fund_detail_fragment_manager_description_text_view);

        onView(withId(R.id.fund_detail_fragment_manager_description_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_detail_fragment_manager_name_text_view_is_correct() {
        scrollToView(R.id.fund_detail_fragment_manager_description_text_view);

        onView(withId(R.id.fund_detail_fragment_manager_description_text_view))
                .check(matches(withText(FUND_MANAGER_DESCRIPTION)));
    }

}
