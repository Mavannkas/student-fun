package com.ludwiniak.first.lab8.Studies.Utils;

import java.util.Locale;

public class StringUtils {
    public static String capitalize(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}
