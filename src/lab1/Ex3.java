package com.lab1;

import java.util.Scanner;

public class Ex3 {
    public static void run () {
        System.out.print("\nEx3\n");
        System.out.print("Intoduceti n");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();;

        System.out.print(n / 1000 + "" + n % 100);
    }
}
