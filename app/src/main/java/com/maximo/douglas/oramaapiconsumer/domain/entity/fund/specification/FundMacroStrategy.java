package com.maximo.douglas.oramaapiconsumer.domain.entity.fund.specification;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FundMacroStrategy {
    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("explanation")
    @Expose
    private String explanation;

    @SerializedName("name")
    @Expose
    private String name;

    public Integer getId() {
        return id;
    }

    public String getExplanation() {
        return explanation;
    }

    public String getName() {
        return name;
    }
}
