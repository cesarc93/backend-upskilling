package com.upskilling.w01;

public class Calculator {

    public enum Operation {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }

    public double calculate(Operation operation, double left, double right) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation must not be null");
        }

        return switch (operation) {
            case ADD -> left + right;
            case SUBTRACT -> left - right;
            case MULTIPLY -> left * right;
            case DIVIDE -> {
                if (right == 0.0) {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                yield left / right;
            }
        };
    }
}