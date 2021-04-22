package com.maximo.douglas.oramaapiconsumer.domain.entity.fund.specification;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Specification {
    @SerializedName("fund_main_strategy_name")
    @Expose
    private String fundMainStrategyName;

    @SerializedName("fund_suitability_profile")
    @Expose
    private FundSuitabilityProfile fundSuitabilityProfile;

    @SerializedName("fund_risk_profile")
    @Expose
    private FundRiskProfile fundRiskProfile;

    @SerializedName("fund_main_strategy_explanation")
    @Expose
    private String fundMainStrategyExplanation;

    @SerializedName("fund_type")
    @Expose
    private String fundType;

    @SerializedName("fund_class")
    @Expose
    private String fundClass;

    @SerializedName("fund_macro_strategy")
    @Expose
    private FundMacroStrategy fundMacroStrategy;

    @SerializedName("fund_class_anbima")
    @Expose
    private String fundClassAnbima;

    @SerializedName("fund_main_strategy")
    @Expose
    private FundMainStrategy fundMainStrategy;

    @SerializedName("is_qualified")
    @Expose
    private String isQualified;

    public String getFundMainStrategyName() {
        return fundMainStrategyName;
    }

    public FundSuitabilityProfile getFundSuitabilityProfile() {
        return fundSuitabilityProfile;
    }

    public FundRiskProfile getFundRiskProfile() {
        return fundRiskProfile;
    }

    public String getFundMainStrategyExplanation() {
        return fundMainStrategyExplanation;
    }

    public String getFundType() {
        return fundType;
    }

    public String getFundClass() {
        return fundClass;
    }

    public FundMacroStrategy getFundMacroStrategy() {
        return fundMacroStrategy;
    }

    public String getFundClassAnbima() {
        return fundClassAnbima;
    }

    public FundMainStrategy getFundMainStrategy() {
        return fundMainStrategy;
    }

    public String getIsQualified() {
        return isQualified;
    }
}
