package com.example.calculatorLv2;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    final private List<Integer> resultList = new ArrayList<>();

    public void add(int a, int b) {
        setter(a + b);
    }
    public void subtract(int a, int b) {
        setter(a - b);
    }
    public void multiply(int a, int b) {
        setter(a * b);
    }
    public void divide(int a, int b) {
        if (b == 0){
            System.out.println("분모는 0이 될 수 없습니다.");
            setter(0);
        }
        else {
            setter(a / b);
        }
    }

    public int getter() {
        return resultList.getLast();
    }

    public void setter(int a) {
        resultList.add(a);
    }

    public void RemoveHead() {
        resultList.removeFirst();
    }
}
