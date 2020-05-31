package com.lab6;

import java.util.Scanner;

public class Main {
    public static boolean isPrim (int n) {
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void numarul() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti numarul: ");

        int num = sc.nextInt();

        if (isPrim(num)) {
            int i = num + 1;

            while (true) {
                if (isPrim(i)) {
                    System.out.println(i);
                    break;
                }
                i++;
            }
            return;
        }


        if (num % 2 != 0 && !isPrim(num)) {
            System.out.println(num + 2);
            return;
        }

        if (num % 2 == 0) {
            System.out.println(num + 2);
        }
    }

    public static void main(String[] args) {
        numarul();

        functie f1 = new F1();
        functie f2 = new F2();
        functie f3 = new F3();

        System.out.println("Prima functia: " + f1.f(7));
        System.out.println("A doua functia: " + f2.f(12));
        System.out.println("A treia functia: " + f3.f(3));
    }
}
