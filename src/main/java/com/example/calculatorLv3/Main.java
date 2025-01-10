package com.example.calculatorLv3;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num = sc.nextDouble();

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = sc.nextDouble();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            switch (operator) {
                case ('+'):
                    calculator.ArithmeticCalculator(num, num2, Calculator.OperatorType.PLUS);
                    break;
                case ('-'):
                    calculator.ArithmeticCalculator(num, num2, Calculator.OperatorType.MINUS);
                    break;
                case ('*'):
                    calculator.ArithmeticCalculator(num, num2, Calculator.OperatorType.MULTIPLY);
                    break;
                case ('/'):
                    calculator.ArithmeticCalculator(num, num2, Calculator.OperatorType.DIVIDE);
                    break;
                default:
                    System.out.println("잘못된 연산 기호를 입력했습니다.");
            }

            System.out.println("결과값 조회 조건을 입력하세요. 입력한 값 이상의 값들이 출력됩니다.");
            double result = sc.nextDouble();
            List<Double> results = calculator.getter(result);
            if (results.isEmpty())
            {
                System.out.println("보다 큰 값이 없습니다.");
            }
            else
            {
                System.out.println("조건을 만족하는 값들: ");
                results.forEach(System.out::println);
            }

            sc.nextLine();
            System.out.println("계속하려면 엔터, 종료하려면 'exit'를 입력해주세요!");
            String continueInput = sc.nextLine();
            if (continueInput.equals("exit")) { System.exit(0); }
        }
    }
}
