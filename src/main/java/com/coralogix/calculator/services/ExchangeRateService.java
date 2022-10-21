package com.coralogix.calculator.services;

import com.coralogix.calculator.model.ExchangeRate;

import java.util.List;

public interface ExchangeRateService {
    public List<ExchangeRate> findAll();
}
