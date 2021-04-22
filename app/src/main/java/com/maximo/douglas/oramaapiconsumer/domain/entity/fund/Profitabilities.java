package com.maximo.douglas.oramaapiconsumer.domain.entity.fund;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Profitabilities {
    @SerializedName("m60")
    @Expose
    private String m60;

    @SerializedName("m48")
    @Expose
    private String m48;

    @SerializedName("m24")
    @Expose
    private String m24;

    @SerializedName("m36")
    @Expose
    private String m36;

    @SerializedName("month")
    @Expose
    private String month;

    @SerializedName("m12")
    @Expose
    private String m12;

    @SerializedName("year")
    @Expose
    private String year;

    @SerializedName("day")
    @Expose
    private String day;

    public String getM60() {
        return m60;
    }

    public String getM48() {
        return m48;
    }

    public String getM24() {
        return m24;
    }

    public String getM36() {
        return m36;
    }

    public String getMonth() {
        return month;
    }

    public String getM12() {
        return m12;
    }

    public String getYear() {
        return year;
    }

    public String getDay() {
        return day;
    }
}
