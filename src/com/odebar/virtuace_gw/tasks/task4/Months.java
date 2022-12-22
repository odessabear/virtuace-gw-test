package com.odebar.virtuace_gw.tasks.task4;

import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Months {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type substring to get result" + "\n");
        String substring = scanner.next();
        List<Integer> result = test(substring);
        System.out.println(result);
    }

    private static List<Integer> test(String substring) {
        List<Integer> values = Arrays.stream(Month.values())
                .filter(month -> month.name().contains(substring))
                .map(month -> month.name().length())
                .distinct()
                .collect(Collectors.toList());
        if (values.isEmpty()) {
            System.out.println("No month contains this symbol!");
        }
        return values;
    }
}
