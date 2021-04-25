package com.maximo.douglas.oramaapiconsumer.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathUtilsUnitTest {

    private static final Double NOT_ROUNDED_DOUBLE_VALUE = 2.346;
    private static final Double ROUNDED_DOUBLE_VALUE = 2.35;
    private static final Integer DECIMAL_PLACES = 2;

    private static final String NOT_ROUNDED_STRING_VALUE = "0.02346";
    private static final String ROUNDED_STRING_PERCENT_VALUE = "2.35%";

    @Test
    public void round_double() {
        Double actual = MathUtils.round(NOT_ROUNDED_DOUBLE_VALUE, DECIMAL_PLACES);

        assertEquals(ROUNDED_DOUBLE_VALUE, actual);
    }

    @Test
    public void format_string_percent() {
        String actual = MathUtils.formatStringPercent(NOT_ROUNDED_STRING_VALUE);

        assertEquals(ROUNDED_STRING_PERCENT_VALUE, actual);
    }
}