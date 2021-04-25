package com.maximo.douglas.oramaapiconsumer.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathUtils {

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static String formatStringPercent(String value) {
        String resultString = "0.00%";

        if (value != null) {
            double volatilityDouble = Double.parseDouble(value) * 100;

            resultString = MathUtils.round(volatilityDouble, 2) + "%";
        }

        return resultString;
    }

}
