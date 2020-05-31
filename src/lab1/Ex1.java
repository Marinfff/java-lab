package com.lab1;

import java.util.Scanner;

public class Ex1 {
    public static void run () {
        System.out.print("Ex1\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti n" + "\n");

        int n = scanner.nextInt();
        double min = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Introduceti nr " + i + "\n");
            double number = scanner.nextDouble();

            if (i == 0) {
                min = number;
            } else if (number < min) {
                min = number;
            }
        }

        System.out.print("\n" + min);
    }
}
