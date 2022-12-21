package com.odebar.virtuace_gw.tasks.task3;

import java.util.Scanner;

public class ColorSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the time in minutes elapsed since the beginning of the hour: ");
        float t = scanner.nextFloat();
        System.out.println(getColor(t));
    }

    private static String getColor(float t) {
        float minutesInCycle = t % 5;

        if (minutesInCycle < 3) {
            return "green";
        } else if (minutesInCycle < 4) {
            return "yellow";
        } else {
            return "red";
        }
    }
}
