package com.example.demo.endpoint.rest.controller.calc;

import com.example.demo.PojaGenerated;
import com.example.demo.calc.entity.CalculationRequest;
import com.example.demo.calc.entity.CalculationResult;
import com.example.demo.calc.service.CalculationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
@AllArgsConstructor
public class CalculationController {

    CalculationService calculationService;

    @GetMapping("/calc/add")
    public CalculationResult add(CalculationRequest request) {

        return calculationService.add(request.a(), request.b());
    }

    @GetMapping("/calc/subtract")
    public CalculationResult subtract(CalculationRequest request) {

        return calculationService.subtract(request.a(), request.b());
    }

    @GetMapping("/calc/multiply")
    public CalculationResult multiply(CalculationRequest request) {

        return calculationService.multiply(request.a(), request.b());
    }

    @GetMapping("/calc/divide")
    public CalculationResult divide(CalculationRequest request) {

        return calculationService.divide(request.a(), request.b());
    }
}
