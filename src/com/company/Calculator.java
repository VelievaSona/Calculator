package com.company;

import java.security.InvalidParameterException;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
        /**
         * Ошибка деления на ноль. Обработка этой ошибка указана ниже
         */
        if (y == 0){
            throw new InvalidParameterException("Деление на 0");
        }

        return x / y;
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
