package com.mycompany.calculator.divisionservice.controller;

import com.mycompany.calculator.divisionservice.domain.CalculationResult;
import com.mycompany.calculator.divisionservice.service.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "api/division")
@RestController
public class DivisionController implements IDivisionController {

    public final IDivisionService service;

    public DivisionController(IDivisionService service) {
        this.service = service;
    }


    @GetMapping(
            value = "/calculate",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Override
    public CalculationResult getCalculationResult(Integer one, Integer two) {
        return service.divTwoNumbers(one, two);
    }
}
