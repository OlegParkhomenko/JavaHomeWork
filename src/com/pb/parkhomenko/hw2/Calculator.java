package com.pb.parkhomenko.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;

        System.out.print("Введите целое число: ");
        operand1 = scan.nextInt();

        System.out.print("Введите целое число 2: ");
        operand2 = scan.nextInt();

        System.out.print("Введите арифметическую операцию +,-,*,/: ");
        sign = scan.next();

        switch (sign) {
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
                case "/":
                    if (operand2 == 0) {
                        System.out.println("Делить на 0 нельзя");
                    } else {
                        System.out.println((float)operand1 / operand2);
                    }

                    break;

            default:
                System.out.println("Операция не найдена");
                break;

        }



    }
}
