package com.example.calculatorLv2;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    final private List<Integer> resultList = new ArrayList<>();

    public void calculation(int a, int b, char operator) {
        switch (operator) {
            case ('+'):
                resultList.add(a + b);
                break;
            case ('-'):
                resultList.add(a - b);
                break;
            case ('*'):
                resultList.add(a * b);
                break;
            case ('/'):
                if (b == 0){
                    System.out.println("분모는 0이 될 수 없습니다.");
                    resultList.add(0);
                }
                else {
                    resultList.add(a / b);
                }
                break;
            default:
                System.out.println("잘못된 연산 기호를 입력했습니다.");
        }
    }

    public int getter() { return resultList.getLast(); }

    public void RemoveHead() { resultList.removeFirst(); }
}
