package com.coralogix.calculator.services.impl;

import com.coralogix.calculator.model.ExchangeRate;
import com.coralogix.calculator.repository.ExchangeRepository;
import com.coralogix.calculator.services.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeRateServiceImpl implements ExchangeRateService {

    @Autowired
    private ExchangeRepository exchangeRepository;

    public List<ExchangeRate> findAll() {
        return exchangeRepository.findAll();
    }
}
