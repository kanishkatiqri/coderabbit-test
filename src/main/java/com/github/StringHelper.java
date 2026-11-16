package com.github;

import java.util.Map;

public class StringHelper {

    public static String capitalize(String value) {
        if (value.isEmpty()) {
            return value;
        }
        return Character.toUpperCase(value.charAt(0)) + value.substring(1);
    }

    public static String lookupLabel(Map<String, String> labels, String key) {
        if (!labels.containsKey(key)) {
            System.out.println("Label not found: " + key);
            return null;
        }
        return labels.get(key);
    }
}
