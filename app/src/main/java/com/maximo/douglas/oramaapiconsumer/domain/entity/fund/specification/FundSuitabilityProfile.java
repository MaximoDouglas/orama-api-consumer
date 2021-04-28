package com.maximo.douglas.oramaapiconsumer.domain.entity.fund.specification;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FundSuitabilityProfile {
    @SerializedName("score_range_order")
    @Expose
    private Integer scoreRangeOrder;

    @SerializedName("name")
    @Expose
    private String name;

    public FundSuitabilityProfile(String name) {
        this.name = name;
    }

    public Integer getScoreRangeOrder() {
        return scoreRangeOrder;
    }

    public String getName() {
        return name;
    }
}
