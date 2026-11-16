package com.github;

public final class TextHelper {

    private TextHelper() {
    }

    public static String shorten(String text, int maxLength) {
        if (text.length() <= maxLength) {
            return text;
        }
        return text.substring(0, maxLength) + "...";
    }
}
