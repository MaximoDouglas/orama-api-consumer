package com.maximo.douglas.oramaapiconsumer.utils;

import android.os.Bundle;

public class FragmentUtils {

    public static Boolean bundleContainsKeys(Bundle bundle, String... keys) {
        for (String key : keys) {
            if (!bundle.containsKey(key)) {
                return false;
            }
        }

        return true;
    }

}
