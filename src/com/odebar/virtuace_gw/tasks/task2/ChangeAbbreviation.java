package com.odebar.virtuace_gw.tasks.task2;


import java.util.HashMap;
import java.util.Map;

public class ChangeAbbreviation {
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
        String[] inputData = {
                "555 Straight Stave Ave, San Francisco, CA 94104",
                "444 Ave Maria Stairway St., San Francisco, CA 94104",
                "9032 Flave Steep Str, San Francisco, CA 94104"
        };
        for (String address : inputData) {
            String fullAddress = convertAddress(address);
            System.out.println(fullAddress);
        }
    }

    private static String convertAddress(String address) {
        String fullAddress = address;
        for (Map.Entry<String, String> entry : FULL_FORM_MAP.entrySet()) {
            fullAddress = fullAddress.replace(entry.getKey(), entry.getValue());
        }
        return fullAddress;
    }
}
