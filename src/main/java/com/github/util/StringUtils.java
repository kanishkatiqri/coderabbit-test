package com.github.util;

import java.util.Objects;

public final class StringUtils {

    private static final String ELLIPSIS = "...";

    private StringUtils() {
    }

    public static String truncate(String text, int maxLength) {
        Objects.requireNonNull(text, "text must not be null");
        if (maxLength < ELLIPSIS.length()) {
            throw new IllegalArgumentException("maxLength must be at least " + ELLIPSIS.length());
        }
        if (text.length() <= maxLength) {
            return text;
        }
        return text.substring(0, maxLength - ELLIPSIS.length()) + ELLIPSIS;
    }
}
