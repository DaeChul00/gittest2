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

    @GetMapping("/sub")
    public int sub(@RequestParam int a, @RequestParam int b) {
        return calculatorService.subtract(a, b);
    }

    @GetMapping("/mul")
    public int mul(@RequestParam int a, @RequestParam int b) {
        return calculatorService.multiply(a, b);
    }

    @GetMapping("/div")
    public int div(@RequestParam int a, @RequestParam int b) {
        return calculatorService.divide(a, b);
    }

    @PostMapping("/add")
    public int addPost(@RequestBody CalculationRequest request) {
        return calculatorService.add(request.getA(), request.getB());
    }
}