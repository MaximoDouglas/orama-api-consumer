package com.maximo.douglas.oramaapiconsumer.domain.entity.fund;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Operability {
    @SerializedName("has_operations_on_thursdays")
    @Expose
    private Boolean hasOperationsOnThursdays;

    @SerializedName("retrieval_liquidation_days_type")
    @Expose
    private String retrievalLiquidationDaysType;

    @SerializedName("application_quotation_days_type")
    @Expose
    private String applicationQuotationDaysType;

    @SerializedName("retrieval_quotation_days")
    @Expose
    private Integer retrievalQuotationDays;

    @SerializedName("anticipated_retrieval_quotation_days_type")
    @Expose
    private String anticipatedRetrievalQuotationDaysType;

    @SerializedName("anticipated_retrieval_quotation_days_str")
    @Expose
    private String anticipatedRetrievalQuotationDaysStr;

    @SerializedName("retrieval_quotation_days_type")
    @Expose
    private String retrievalQuotationDaysType;

    @SerializedName("anticipated_retrieval_quotation_days")
    @Expose
    private Integer anticipatedRetrievalQuotationDays;

    @SerializedName("has_operations_on_wednesdays")
    @Expose
    private Boolean hasOperationsOnWednesdays;

    @SerializedName("minimum_balance_permanence")
    @Expose
    private String minimumBalancePermanence;

    @SerializedName("has_operations_on_mondays")
    @Expose
    private Boolean hasOperationsOnMondays;

    @SerializedName("has_grace_period")
    @Expose
    private Boolean hasGracePeriod;

    @SerializedName("application_time_limit")
    @Expose
    private String applicationTimeLimit;

    @SerializedName("retrieval_time_limit")
    @Expose
    private String retrievalTimeLimit;

    @SerializedName("has_operations_on_fridays")
    @Expose
    private Boolean hasOperationsOnFridays;

    @SerializedName("anticipate_retrieval_liquidation_days")
    @Expose
    private Integer anticipateRetrievalLiquidationDays;

    @SerializedName("minimum_initial_application_amount")
    @Expose
    private String minimumInitialApplicationAmount;

    @SerializedName("anticipate_retrieval_liquidation_days_type")
    @Expose
    private String anticipateRetrievalLiquidationDaysType;

    @SerializedName("retrieval_special_type")
    @Expose
    private String retrievalSpecialType;

    @SerializedName("anticipate_retrieval_liquidation_days_str")
    @Expose
    private String anticipateRetrievalLiquidationDaysStr;

    @SerializedName("application_quotation_days_str")
    @Expose
    private String applicationQuotationDaysStr;

    @SerializedName("grace_period_in_days_str")
    @Expose
    private String gracePeriodInDaysStr;

    @SerializedName("retrieval_quotation_days_str")
    @Expose
    private String retrievalQuotationDaysStr;

    @SerializedName("grace_period_in_days")
    @Expose
    private Integer gracePeriodInDays;

    @SerializedName("retrieval_liquidation_days_str")
    @Expose
    private String retrievalLiquidationDaysStr;

    @SerializedName("minimum_subsequent_retrieval_amount")
    @Expose
    private String minimumSubsequentRetrievalAmount;

    @SerializedName("retrieval_direct")
    @Expose
    private Boolean retrievalDirect;

    @SerializedName("retrieval_liquidation_days")
    @Expose
    private Integer retrievalLiquidationDays;

    @SerializedName("application_quotation_days")
    @Expose
    private Integer applicationQuotationDays;

    @SerializedName("max_balance_permanence")
    @Expose
    private String maxBalancePermanence;

    @SerializedName("maximum_initial_application_amount")
    @Expose
    private String maximumInitialApplicationAmount;

    @SerializedName("has_operations_on_tuesdays")
    @Expose
    private Boolean hasOperationsOnTuesdays;

    @SerializedName("minimum_subsequent_application_amount")
    @Expose
    private String minimumSubsequentApplicationAmount;

    public Boolean getHasOperationsOnThursdays() {
        return hasOperationsOnThursdays;
    }

    public String getRetrievalLiquidationDaysType() {
        return retrievalLiquidationDaysType;
    }

    public String getApplicationQuotationDaysType() {
        return applicationQuotationDaysType;
    }

    public Integer getRetrievalQuotationDays() {
        return retrievalQuotationDays;
    }

    public String getAnticipatedRetrievalQuotationDaysType() {
        return anticipatedRetrievalQuotationDaysType;
    }

    public String getAnticipatedRetrievalQuotationDaysStr() {
        return anticipatedRetrievalQuotationDaysStr;
    }

    public String getRetrievalQuotationDaysType() {
        return retrievalQuotationDaysType;
    }

    public Integer getAnticipatedRetrievalQuotationDays() {
        return anticipatedRetrievalQuotationDays;
    }

    public Boolean getHasOperationsOnWednesdays() {
        return hasOperationsOnWednesdays;
    }

    public String getMinimumBalancePermanence() {
        return minimumBalancePermanence;
    }

    public Boolean getHasOperationsOnMondays() {
        return hasOperationsOnMondays;
    }

    public Boolean getHasGracePeriod() {
        return hasGracePeriod;
    }

    public String getApplicationTimeLimit() {
        return applicationTimeLimit;
    }

    public String getRetrievalTimeLimit() {
        return retrievalTimeLimit;
    }

    public Boolean getHasOperationsOnFridays() {
        return hasOperationsOnFridays;
    }

    public Integer getAnticipateRetrievalLiquidationDays() {
        return anticipateRetrievalLiquidationDays;
    }

    public String getMinimumInitialApplicationAmount() {
        return minimumInitialApplicationAmount;
    }

    public String getAnticipateRetrievalLiquidationDaysType() {
        return anticipateRetrievalLiquidationDaysType;
    }

    public String getRetrievalSpecialType() {
        return retrievalSpecialType;
    }

    public String getAnticipateRetrievalLiquidationDaysStr() {
        return anticipateRetrievalLiquidationDaysStr;
    }

    public String getApplicationQuotationDaysStr() {
        return applicationQuotationDaysStr;
    }

    public String getGracePeriodInDaysStr() {
        return gracePeriodInDaysStr;
    }

    public String getRetrievalQuotationDaysStr() {
        return retrievalQuotationDaysStr;
    }

    public Integer getGracePeriodInDays() {
        return gracePeriodInDays;
    }

    public String getRetrievalLiquidationDaysStr() {
        return retrievalLiquidationDaysStr;
    }

    public String getMinimumSubsequentRetrievalAmount() {
        return minimumSubsequentRetrievalAmount;
    }

    public Boolean getRetrievalDirect() {
        return retrievalDirect;
    }

    public Integer getRetrievalLiquidationDays() {
        return retrievalLiquidationDays;
    }

    public Integer getApplicationQuotationDays() {
        return applicationQuotationDays;
    }

    public String getMaxBalancePermanence() {
        return maxBalancePermanence;
    }

    public String getMaximumInitialApplicationAmount() {
        return maximumInitialApplicationAmount;
    }

    public Boolean getHasOperationsOnTuesdays() {
        return hasOperationsOnTuesdays;
    }

    public String getMinimumSubsequentApplicationAmount() {
        return minimumSubsequentApplicationAmount;
    }
}
