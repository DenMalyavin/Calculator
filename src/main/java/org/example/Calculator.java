package org.example;

import java.util.Scanner;

public class Calculator {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите первое число а:");
            double a = sc.nextInt();
            System.out.println("Введите первое число b:");
            double b = sc.nextInt();
            System.out.println("Ваши числа :" + "\n" + "а = " + a + "\n" + "b = " + b);
            System.out.println("Выбирите действие : + , - , / , *, %");
            char c = sc.next().charAt(0);
            System.out.println("Выше действие : " + c);
            if (c == '+') {
                a = a + b;
                System.out.println("\n" + "a + b = " + a);

            } else if (c == '-') {
                a = a - b;
                System.out.println("\n" + "a - b = " + a);
            } else if (c == '*') {
                a = a * b;
                System.out.println("\n" + "a * b = " + a);

            } else if (c == '/') {
                if (b == 0) {
                    System.out.println("\n" + "На ноль делить нельзя");
                } else {
                    a = a / b;
                    System.out.println("\n" + "a / b = " + a);
                }
            } else if (c == '%') {
                if (b == 0) {
                    System.out.println("\n" + "Еблан на 0 не делят");
                } else {
                    a = (a * 100) / b;
                    System.out.println("\n" + "a % b = " + a);
                }


            }
        }
    }

