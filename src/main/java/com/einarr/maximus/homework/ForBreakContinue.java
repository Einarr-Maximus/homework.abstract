package com.einarr.maximus.homework;

public interface ForBreakContinue {
    public static void main(String[] args) {

        double x;
        double y;
        for (x = -2; x <= 2; x += 0.25) {
            if (x == 0)
                continue;
            y = 1 / x;
            System.out.println("x = " + x + "   y = " + y);
        }

        // Решить предыдущее задание с использованием break

        double a;
        double b;
        for (a = -2; a <= 2; a += 0.25) {
            b = 1 / a;
            if (a == 0)
                break;
            System.out.println("a = " + a + "   b = " + b);
        }
        if (a == 0)
            for (a = 0.25; a <= 2; a += 0.25) {
                b = 1 / a;
                System.out.println("a = " + a + "   b = " + b);
            }
    }
}
