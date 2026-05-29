package com.example.demo.calc.service;

import static org.junit.jupiter.api.Assertions.*;

import com.example.demo.calc.entity.CalculationResult;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CalculationServiceTest {

    @InjectMocks
    CalculationService service;

    @Test
    void add_positiveNumbers_returnsSum() {
        CalculationResult result = service.add(5, 3);
        assertEquals(8.0, result.result());
    }

    @Test
    void add_negativeA_throwsException() {
        assertThrows(ArithmeticException.class, () -> service.add(-1, 5));
    }

    @Test
    void add_zeroA_throwsException() {
        assertThrows(ArithmeticException.class, () -> service.add(0, 5));
    }

    @Test
    void subtract_positiveNumbers_returnsDifference() {
        CalculationResult result = service.subtract(5, 3);
        assertEquals(2.0, result.result());
    }

    @Test
    void subtract_negativeResult_returnsNegative() {
        CalculationResult result = service.subtract(3, 5);
        assertEquals(-2.0, result.result());
    }

    @Test
    void subtract_zeroResult_returnsZero() {
        CalculationResult result = service.subtract(3, 3);
        assertEquals(0.0, result.result());
    }

    @Test
    void multiply_positiveNumbers_returnsProduct() {
        CalculationResult result = service.multiply(5, 3);
        assertEquals(15.0, result.result());
    }

    @Test
    void multiply_withNegative_returnsNegative() {
        CalculationResult result = service.multiply(-5, 3);
        assertEquals(-15.0, result.result());
    }

    @Test
    void multiply_withZero_returnsZero() {
        CalculationResult result = service.multiply(5, 0);
        assertEquals(0.0, result.result());
    }

    @Test
    void divide_positiveNumbers_returnsQuotient() {
        CalculationResult result = service.divide(10, 2);
        assertEquals(5.0, result.result());
    }

    @Test
    void divide_byZero_throwsException() {
        assertThrows(ArithmeticException.class, () -> service.divide(5, 0));
    }

    @Test
    void divide_nonDivisible_returnsDecimal() {
        CalculationResult result = service.divide(5, 2);
        assertEquals(2.5, result.result());
    }
}
