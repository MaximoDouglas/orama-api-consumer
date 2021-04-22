package com.maximo.douglas.oramaapiconsumer.domain.entity.fund;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fee {
    @SerializedName("maximum_administration_fee")
    @Expose
    private String maximumAdministrationFee;

    @SerializedName("anticipated_retrieval_fee_value")
    @Expose
    private String anticipatedRetrievalFeeValue;

    @SerializedName("administration_fee")
    @Expose
    private String administrationFee;

    @SerializedName("anticipated_retrieval_fee")
    @Expose
    private String anticipatedRetrievalFee;

    @SerializedName("performance_fee")
    @Expose
    private String performanceFee;

    @SerializedName("has_anticipated_retrieval")
    @Expose
    private Boolean hasAnticipatedRetrieval;

    public String getMaximumAdministrationFee() {
        return maximumAdministrationFee;
    }

    public String getAnticipatedRetrievalFeeValue() {
        return anticipatedRetrievalFeeValue;
    }

    public String getAdministrationFee() {
        return administrationFee;
    }

    public String getAnticipatedRetrievalFee() {
        return anticipatedRetrievalFee;
    }

    public String getPerformanceFee() {
        return performanceFee;
    }

    public Boolean getHasAnticipatedRetrieval() {
        return hasAnticipatedRetrieval;
    }
}
