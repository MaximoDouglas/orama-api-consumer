package com.maximo.douglas.oramaapiconsumer.domain.entity.fund;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.maximo.douglas.oramaapiconsumer.utils.MathUtils;

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

    public Profitabilities(
            String m60,
            String m48,
            String m24,
            String m36,
            String month,
            String m12,
            String year,
            String day
    ) {
        this.m60 = m60;
        this.m48 = m48;
        this.m24 = m24;
        this.m36 = m36;
        this.month = month;
        this.m12 = m12;
        this.year = year;
        this.day = day;
    }

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

    public String getFormattedM60() {
        return MathUtils.formatStringPercent(m60);
    }

    public String getFormattedM48() {
        return MathUtils.formatStringPercent(m48);
    }

    public String getFormattedM24() {
        return MathUtils.formatStringPercent(m24);
    }

    public String getFormattedM36() {
        return MathUtils.formatStringPercent(m36);
    }

    public String getFormattedMonth() {
        return MathUtils.formatStringPercent(month);
    }

    public String getFormattedM12() {
        return MathUtils.formatStringPercent(m12);
    }

    public String getFormattedYear() {
        return MathUtils.formatStringPercent(year);
    }

    public String getFormattedDay() {
        return MathUtils.formatStringPercent(day);
    }
}
