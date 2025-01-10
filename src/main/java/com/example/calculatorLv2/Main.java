package com.example.calculatorLv2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            calculator.calculation(num, num2, operator);

            System.out.println(calculator.getter());

            sc.nextLine();
            System.out.println("계속하려면 엔터, 종료하려면 'exit'를 입력해주세요!");
            String continueInput = sc.nextLine();
            if (continueInput.equals("exit")) { System.exit(0); }
        }
    }
}
