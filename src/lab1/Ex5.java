package com.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void run() {
        System.out.print("Ex5\n");
        System.out.print("Introduceti n" + "\n");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduceti nr " + i + "\n");
            array[i] = scanner.nextInt();
        }


        for (int i = 0; i < array.length ; i++) {
            int aux = array[array.length - 1];

            for (int j = array.length - 1; j >= 0; j--) {
                if (j != 0) {
                    array[j] = array[j - 1];
                }
            }

            array[0] = aux;
            System.out.print(Arrays.toString(array));
        }

    }
}
