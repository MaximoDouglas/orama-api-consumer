package com.maximo.douglas.oramaapiconsumer.instrumented.funddetailfragment;

import android.os.Bundle;

import androidx.fragment.app.testing.FragmentScenario;
import androidx.lifecycle.Lifecycle;

import com.maximo.douglas.oramaapiconsumer.R;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Fund;
import com.maximo.douglas.oramaapiconsumer.testutils.BaseInstrumentedTesting;
import com.maximo.douglas.oramaapiconsumer.testutils.entitiesfaker.FundFaker;
import com.maximo.douglas.oramaapiconsumer.ui.funddetail.FundDetailFragment;

public class FundDetailFragmentTestContext extends BaseInstrumentedTesting {

    protected static final String SIMPLE_NAME = "PIMCO Income Dólar FIC FIM IE";

    protected static final boolean IS_SIMPLE = false;
    protected static final String EXPECTED_IS_SIMPLE = "Não";

    protected static final String MINMIMUM_INITIAL_APPLICATION_AMOUNT = "5000.00";
    protected static final String EXPECTED_MINMIMUM_INITIAL_APPLICATION_AMOUNT = "R$ 5000.00";

    protected static final String MAIN_STRATEGY_NAME = "Renda Fixa Global";

    protected static final String SUITABILITY_PROFILE_NAME = "Arrojado";

    protected static final String FUND_CLASS = "Multimercado Investimento no Exterior";

    protected static final String VOLATILITY_12_M = "0.181350";
    protected static final String EXPECTED_VOLATILITY_12_M = "18.14%";

    protected static final String M60 = null;
    protected static final String EXPECTED_M60 = "0.00%";

    protected static final String M48 = null;
    protected static final String EXPECTED_M48 = "0.00%";

    protected static final String M24 = "0.571826";
    protected static final String EXPECTED_M24 = "57.18%";

    protected static final String M36 = null;
    protected static final String EXPECTED_M36 = "0.00%";

    protected static final String MONTH = "-0.023477";
    protected static final String EXPECTED_MONTH = "-2.35%";

    protected static final String M12 = "0.247703";
    protected static final String EXPECTED_M12 = "24.77%";

    protected static final String YEAR = "0.060386";
    protected static final String EXPECTED_YEAR = "6.04%";

    protected static final String DAY = "-0.005200";
    protected static final String EXPECTED_DAY = "-0.52%";


    protected static final String FUND_CLASS_ANBIMA = "Fundos que podem investir mais " +
            "de 40% do seu patrimônio líquido em ativos financeiros no exterior.";

    protected static final String FUND_OBJECTIVE = "A política de investimento do FUNDO consiste\r\nem " +
            "aplicar, no mínimo, 95% (noventa e cinco por cento)\r\nde seu patrimônio líquido " +
            "em cotas do PIMCO INCOME\r\nDÓLAR FUNDO DE INVESTIMENTO MULTIMERCADO\r\nINVESTIMENTO " +
            "NO EXTERIOR, inscrito no CNPJ nº\r\n32.225.606/0001-11 (“Fundo Master”), administrado " +
            "pelo\r\nADMINISTRADOR e gerido pela GESTORA, cuja\r\npolítica de investimento consiste " +
            "em aplicar os recursos\r\ndos cotistas em instrumentos, valores mobiliários e\r\nativos " +
            "financeiros de diferentes naturezas e\r\ncaracterísticas, de acordo com uma política " +
            "de gestão\r\nde carteira com o objetivo de que visa a obter\r\noportunidades em " +
            "diferentes mercados, baseada em\r\numa sólida análise macroeconômica e " +
            "sujeita às\r\nrestrições descritas no presente Regulamento.";

    protected static final String MANAGER_NAME = "PIMCO";
    protected static final String EXPECTED_MANAGER_NAME_LABEL = "Sobre a administradora PIMCO";

    protected static final String MANAGER_DESCRIPTION = "Fundada em 1971, a PIMCO é formada por " +
            "mais de 2.000 profissionais dedicados, em 12 países, compartilhando a mesma missão: " +
            "gerenciar riscos e gerar retorno para nossos clientes. Gerimos investimentos para uma " +
            "ampla variedade de clientes, incluindo fundos de pensão públicos e privados, bem como " +
            "ativos em nome de milhões de pessoas, de todos os extratos sociais, em todo o mundo. " +
            "Somos investidores de longo prazo e líderes de opinião. Nossas perspectivas e soluções " +
            "baseiam-se em um processo de investimento comprovado, que gera visões macroeconômicas " +
            "cíclicas (de curto prazo) e seculares (de três a cinco anos), e que alia essas previsões " +
            "com profundas pesquisas de crédito, análises de capital e gerenciamento de riscos. " +
            "Em 30/Jun/2016 a PIMCO possuía USD 1,51 trilhões de ativos sob gestão.";

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
        return FundFaker.getFundFakeObject(
                IS_SIMPLE,
                MINMIMUM_INITIAL_APPLICATION_AMOUNT,
                SUITABILITY_PROFILE_NAME,
                SIMPLE_NAME,
                MAIN_STRATEGY_NAME,
                FUND_CLASS,
                FUND_CLASS_ANBIMA,
                FUND_OBJECTIVE,
                VOLATILITY_12_M, M60, M48, M24, M36, MONTH, M12, YEAR, DAY,
                MANAGER_DESCRIPTION,
                MANAGER_NAME
        );
    }

}
