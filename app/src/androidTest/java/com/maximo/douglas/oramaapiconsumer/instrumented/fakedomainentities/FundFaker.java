package com.maximo.douglas.oramaapiconsumer.instrumented.fakedomainentities;

import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Description;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Fund;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.FundManager;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Operability;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Profitabilities;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.specification.FundSuitabilityProfile;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.specification.Specification;

public class FundFaker {

    public static Fund getFundFakeObject(
            Boolean isSimple,
            String minmimumInitialApplicationAmount,
            String fundSuitabilityProfileName,
            String simpleName,
            String fundMainStrategyName,
            String fundClass,
            String fundClassAnbima,
            String fundDescriptionObjective,
            String volatility12m,
            String m60, String m48, String m24, String m36, String month, String m12, String year, String day,
            String fundManagerDescription,
            String fundManagerName

    ) {
        Operability operability = new Operability(minmimumInitialApplicationAmount);
        FundSuitabilityProfile fundSuitabilityProfile = new FundSuitabilityProfile(fundSuitabilityProfileName);

        Specification specification = new Specification(
                fundMainStrategyName,
                fundSuitabilityProfile,
                fundClass,
                fundClassAnbima
        );

        Description description = new Description(fundDescriptionObjective);
        Profitabilities profitabilities = new Profitabilities(m60, m48, m24, m36, month, m12, year, day);

        FundManager fundManager = new FundManager(fundManagerDescription, fundManagerName);

        return new Fund(
                isSimple,
                operability,
                simpleName,
                specification,
                description,
                volatility12m,
                profitabilities,
                fundManager
        );
    }

}
