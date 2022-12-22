package com.odebar.virtuace_gw.tasks.task2;


import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChangeAbbreviation {
    private static final String PATTERN = "(Ave\\.|Ave\\b|Str\\.|Str\\b|St\\.|St\\b)";
    private static final Map<String, String> FULL_FORM_MAP = new HashMap<>();

    static {
        FULL_FORM_MAP.put("Ave", "Avenue");
        FULL_FORM_MAP.put("Ave.", "Avenue");
        FULL_FORM_MAP.put("St", "Street");
        FULL_FORM_MAP.put("St.", "Street");
        FULL_FORM_MAP.put("Str", "Street");
        FULL_FORM_MAP.put("Str.", "Street");
    }

    public static void main(String[] args) {
        String[] abbrAddress = {
                "555 Straight Stave Ave, San Francisco, CA 94104",
                "444 Ave. Maria Stairway St., San Francisco, CA 94104",
                "9032 Flave Steep Str, San Francisco, CA 94104"
        };

        for (String address : abbrAddress) {
            String fullAddress = convertAbbreviationWithRegExp(address);
            System.out.println(fullAddress);
        }

    }

    private static String convertAbbreviationWithRegExp(String address) {
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(address);
        String key;
        while (matcher.find()) {
            key = matcher.group();
            address = address.replace(key, FULL_FORM_MAP.get(key));
        }
        return address;
    }
}
