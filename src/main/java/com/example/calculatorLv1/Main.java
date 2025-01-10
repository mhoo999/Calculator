package com.example.calculatorLv1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            int result = 0;
            switch (operator) {
                case '+': result = num + num2; break;
                case '-': result = num - num2; break;
                case '*': result = num * num2; break;
                case '/': if (num2 != 0){ result = num / num2; } break;
            }

            if (operator == '/' && num2 == 0) { System.out.println("분모는 0이 될 수 없습니다.");}
            else { System.out.println(result); }

            sc.nextLine();
            System.out.println("계속하려면 엔터, 종료하려면 'exit'를 입력해주세요!");
            String continueInput = sc.nextLine();
            if (continueInput.equals("exit")){ System.exit(0); }
        }
    }
}