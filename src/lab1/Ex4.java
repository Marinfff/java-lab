package com.lab1;

import java.util.Scanner;

public class Ex4 {
    public static void run() {
        System.out.print("Ex4\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti n" + "\n");

        int n = scanner.nextInt();
        int temp = 0;
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduceti nr " + i + "\n");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }


        System.out.print(array[array.length - 2] + "/" + array[array.length - 1]);
    }
}
