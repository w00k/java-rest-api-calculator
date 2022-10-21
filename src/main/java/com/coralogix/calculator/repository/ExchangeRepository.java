package com.coralogix.calculator.repository;

import com.coralogix.calculator.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExchangeRepository extends JpaRepository<ExchangeRate, Integer> {

    public List<ExchangeRate> findAll();
}
