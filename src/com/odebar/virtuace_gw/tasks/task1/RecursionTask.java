package com.odebar.virtuace_gw.tasks.task1;

public class RecursionTask {
    public static void main(String[] args) {
        RecursionTask r = new RecursionTask();
        r.count(5);
    }

    private void count(int n) {
        if (n <= 0) {
            return;
        } else {
            count(n - 1);
            System.out.println(n);
        }
    }
}
