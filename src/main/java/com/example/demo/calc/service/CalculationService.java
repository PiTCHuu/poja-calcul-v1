package com.example.demo.calc.service;

import com.example.demo.PojaGenerated;
import com.example.demo.calc.entity.CalculationResult;
import org.springframework.stereotype.Component;

@PojaGenerated
@Component
public class CalculationService {

  public CalculationResult add(double a, double b) {
    if (a <= 0 || b <= 0) {
      throw new ArithmeticException("Both numbers must be positive");
    }
    return new CalculationResult(a + b);
  }

  public CalculationResult subtract(double a, double b) {

      return new CalculationResult(a - b);
  }

  public CalculationResult multiply(double a, double b) {

      return new CalculationResult(a * b);
  }

  public CalculationResult divide(double a, double b) {
    if (b == 0) {
      throw new ArithmeticException("Division by zero is not allowed");
    }
    return new CalculationResult(a / b);
  }
}
