package com.example.demo.infrastructure.shared.validation;

public record TextPolicy(
        int min,
        int max,
        boolean notEmpty,
        boolean lettersOnly
) {
    public static TextPolicy of(int min, int max) {
        return new TextPolicy(min, max, true, true);
    }

}

