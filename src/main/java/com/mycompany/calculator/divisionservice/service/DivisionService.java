package com.mycompany.calculator.divisionservice.service;

import com.mycompany.calculator.divisionservice.domain.CalculationResult;
import org.springframework.stereotype.Service;

@Service
public class DivisionService implements IDivisionService{
    @Override
    public CalculationResult divTwoNumbers(int num1, int num2) {
        try {
            return new CalculationResult("SUCCESS", (num1 / num2));
        } catch(Exception exception) {
            return new CalculationResult("FAILED: Division with 0", -1);
        }
    }
}
