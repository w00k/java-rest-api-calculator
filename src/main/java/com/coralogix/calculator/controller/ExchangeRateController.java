package com.coralogix.calculator.controller;

import com.coralogix.calculator.model.ExchangeRate;
import com.coralogix.calculator.model.ExchangeRateFix;
import com.coralogix.calculator.services.ExchangeRateService;
import com.coralogix.calculator.services.impl.ExchangeRateFixServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExchangeRateController {

    @Autowired
    private ExchangeRateService exchangeRateService;

    @Autowired
    private ExchangeRateFixServiceImpl exchangeRateFixService;

    @GetMapping("/get-all")
    public List<ExchangeRate> gfindAll() {
        return exchangeRateService.findAll();
    }

    @PostMapping("/exchange-rate/fix")
    public ExchangeRate fixExchangeRate(@RequestBody ExchangeRateFix exchangeRateFix) {
        return exchangeRateFixService
    }
}
