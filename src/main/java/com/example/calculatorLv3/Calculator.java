package com.example.calculatorLv3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {

    private final List<Double> resultList = new ArrayList<>();

    public enum OperatorType{
        PLUS, MINUS, MULTIPLY, DIVIDE,
    }

    public <T extends Number> void ArithmeticCalculator(T a, T b, OperatorType op) {
        double result = 0;
        switch (op) {
            case PLUS:
                result = a.doubleValue() + b.doubleValue();
                break;
            case MINUS:
                result = a.doubleValue() - b.doubleValue();
                break;
            case MULTIPLY:
                result = a.doubleValue() * b.doubleValue();
                break;
            case DIVIDE:
                if (b.doubleValue() == 0){
                    System.out.println("분모는 0이 될 수 없습니다.");
                }
                else {
                    result = a.doubleValue() / b.doubleValue();
                }
                break;
        }

        setter(result);
    }

    public List<Double> getter(double condition) {
        return resultList.stream()
                .filter(result->result > condition)
                .collect(Collectors.toList());
    }

    public void setter(double a) {
        resultList.add(a);
    }

    public void RemoveHead() {
        resultList.removeFirst();
    }
}
