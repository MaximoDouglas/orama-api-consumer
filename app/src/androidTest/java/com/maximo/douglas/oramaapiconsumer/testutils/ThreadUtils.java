package com.maximo.douglas.oramaapiconsumer.testutils;

public class ThreadUtils {

    public static void waitViewToComplete(int timeMillis) {
        try {
            Thread.sleep(timeMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitViewToComplete() {
        int timeMillis = 3000;
        try {
            Thread.sleep(timeMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
