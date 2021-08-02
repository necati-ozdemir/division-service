package com.mycompany.calculator.divisionservice.controller;

import com.mycompany.calculator.divisionservice.domain.CalculationResult;
import org.springframework.web.bind.annotation.RequestParam;


public interface IDivisionController {
    public CalculationResult getCalculationResult(@RequestParam(value = "one") Integer one,
                                                  @RequestParam(value = "two") Integer two);
}
