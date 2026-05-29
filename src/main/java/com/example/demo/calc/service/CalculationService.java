package com.example.demo.calc.service;

import com.example.demo.PojaGenerated;
import com.example.demo.calc.entity.CalculationResult;
import org.springframework.stereotype.Component;

@PojaGenerated
@Component
public class CalculationService {

    public CalculationResult add(long a, long b) {
        if (a <= 0 || b <= 0) {
            throw new ArithmeticException("Both numbers must be positive");
        }
        return new CalculationResult(a + b);
    }

    public CalculationResult subtract(long a, long b) {

        return new CalculationResult(a - b);
    }

    public CalculationResult multiply(long a, long b) {

        return new CalculationResult(a * b);
    }

    public CalculationResult divide(long a, long b) {
        if (b == 0 ) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return new CalculationResult(a / b);
    }
}
