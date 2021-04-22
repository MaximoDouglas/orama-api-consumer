package com.maximo.douglas.oramaapiconsumer.domain.entity.fund;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Description {
    @SerializedName("objective")
    @Expose
    private String objective;

    @SerializedName("movie_url")
    @Expose
    private String movieUrl;

    @SerializedName("target_audience")
    @Expose
    private String targetAudience;

    @SerializedName("strengths")
    @Expose
    private String strengths;

    @SerializedName("strategy")
    @Expose
    private String strategy;

    public String getObjective() {
        return objective;
    }

    public String getMovieUrl() {
        return movieUrl;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public String getStrengths() {
        return strengths;
    }

    public String getStrategy() {
        return strategy;
    }
}
