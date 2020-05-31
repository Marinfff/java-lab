package com.lab1;

import java.util.Scanner;

public class Ex2 {
    public static void run () {
        System.out.print("\nEx2\n");
        Scanner scanner = new Scanner(System.in);

        int n;
        double sum = 0;
        int count = 0;

        do {
            System.out.print("Introduceti un numar \n");
            n = scanner.nextInt();
            sum += n;
            count++;

        } while (n != 0);

        count--;
        System.out.print("Media aritmetica = " + sum / count);
    }
}
