package com.maximo.douglas.oramaapiconsumer.domain.entity.fund.specification;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FundRiskProfile {
    @SerializedName("score_range_order")
    @Expose
    private String scoreRangeOrder;

    @SerializedName("name")
    @Expose
    private String name;

    public String getScoreRangeOrder() {
        return scoreRangeOrder;
    }

    public String getName() {
        return name;
    }
}
