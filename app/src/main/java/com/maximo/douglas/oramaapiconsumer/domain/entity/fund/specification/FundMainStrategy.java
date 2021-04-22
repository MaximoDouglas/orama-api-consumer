package com.maximo.douglas.oramaapiconsumer.domain.entity.fund.specification;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FundMainStrategy {

    @SerializedName("explanation")
    @Expose
    private String explanation;

    @SerializedName("fund_macro_strategy")
    @Expose
    private Integer fundMacroStrategy;

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("name")
    @Expose
    private String name;

    public String getExplanation() {
        return explanation;
    }

    public Integer getFundMacroStrategy() {
        return fundMacroStrategy;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
