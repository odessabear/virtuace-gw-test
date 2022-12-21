package com.odebar.virtuace_gw.tasks.task4;

import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Months {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type substring to get result");
        String substring = scanner.next();
        List<Integer> result = test(substring);
        System.out.println(result);
    }

    public static List<Integer> test(String substring){
        return Arrays.stream(Month.values())
                .filter(month -> month.name().contains(substring))
                .map(month -> month.name().length())
                .distinct()
                .collect(Collectors.toList());
    }
}
