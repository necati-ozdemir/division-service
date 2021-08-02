package com.mycompany.calculator.divisionservice.service;

import com.mycompany.calculator.divisionservice.domain.CalculationResult;

public interface IDivisionService {
    CalculationResult divTwoNumbers(int num1, int num2);
}
