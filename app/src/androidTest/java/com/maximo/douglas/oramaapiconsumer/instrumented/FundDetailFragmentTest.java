package com.maximo.douglas.oramaapiconsumer.instrumented;

import androidx.test.core.app.ActivityScenario;

import com.maximo.douglas.oramaapiconsumer.MainActivity;
import com.maximo.douglas.oramaapiconsumer.R;
import com.maximo.douglas.oramaapiconsumer.testutils.BaseInstrumentedTesting;

import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static com.maximo.douglas.oramaapiconsumer.testutils.RecyclerViewMatcher.withRecyclerView;

public class FundDetailFragmentTest extends BaseInstrumentedTesting {

    private static final String FUND_SIMPLE_NAME = "PIMCO Income Dólar FIC FIM IE";

    private static final String FUND_SIMPLICITY = "Não";

    private static final String FUND_MINIMUM_INITIAL_APPLICATION_AMOUNT = "R$ 5000.00";

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

    private static final int FIRST_ITEM_POSITION = 0;

    @Override
    public void initSetup() {
        ActivityScenario.launch(MainActivity.class);
        navigateToDetailScreen();
    }

    @Test
    public void test_if_fund_detail_fragment_container_is_displayed() {
        onView(withId(R.id.fund_detail_fragment_container)).check(matches(isDisplayed()));
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
        onView(withId(R.id.fund_detail_fragment_description_linear_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_detail_fragment_objective_label_text_view_is_displayed() {
        onView(withId(R.id.fund_detail_fragment_objective_label_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_detail_fragment_objective_label_text_view_is_correct() {
        onView(withId(R.id.fund_detail_fragment_objective_label_text_view))
                .check(matches(withText(R.string.fund_objective)));
    }

    @Test
    public void test_if_fund_detail_fragment_objective_text_view_is_displayed() {
        onView(withId(R.id.fund_detail_fragment_objective_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_detail_fragment_objective_text_view_is_correct() {
        onView(withId(R.id.fund_detail_fragment_objective_text_view))
                .check(matches(withText(FUND_OBJECTIVE)));
    }

    @Test
    public void test_if_fund_detail_fragment_manager_linear_layout_is_displayed() {
        scrollToEnd();
        onView(withId(R.id.fund_detail_fragment_manager_linear_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_detail_fragment_manager_name_label_text_view_is_displayed() {
        scrollToEnd();
        onView(withId(R.id.fund_detail_fragment_manager_name_label_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_detail_fragment_manager_name_label_text_view_is_correct() {
        scrollToEnd();
        onView(withId(R.id.fund_detail_fragment_manager_name_label_text_view))
                .check(matches(withText(FUND_MANAGER_NAME_LABEL)));
    }

    @Test
    public void test_if_fund_detail_fragment_manager_name_text_view_is_displayed() {
        scrollToEnd();
        onView(withId(R.id.fund_detail_fragment_manager_description_text_view)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_fund_detail_fragment_manager_name_text_view_is_correct() {
        scrollToEnd();
        onView(withId(R.id.fund_detail_fragment_manager_description_text_view))
                .check(matches(withText(FUND_MANAGER_DESCRIPTION)));
    }

    private void scrollToEnd() {
        onView(withId(R.id.fund_detail_fragment_manager_description_text_view)).perform(scrollTo());
    }

    private void navigateToDetailScreen() {
        onView(
                withRecyclerView(R.id.fund_listing_recycler_view).atPositionOnView(
                        FIRST_ITEM_POSITION,
                        R.id.fund_card_view_item
                )
        ).perform(click());
    }

}
