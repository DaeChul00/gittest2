package teamtest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import teamtest.service.CalculatorService;
import teamtest.dao.CalculationRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/calc")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return calculatorService.add(a, b);
    }
    
    @GetMapping("/mod")
    public int mod(@RequestParam int a, @RequestParam int b) {
        return calculatorService.modulo(a, b);
    }

}