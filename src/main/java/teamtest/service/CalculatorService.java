package teamtest.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add(int a, int b) { return a + b; }
    
    public int power(int a, int b) {
        return (int) Math.pow(a, b);
    }
}