package com.coralogix.calculator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "exchange_rate")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeRate {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "origin_currency")
    private String originCurrency;

    @Column(name = "final_currency")
    private String finalCurrency;

    @Column(name = "date")
    private String date;

    @Column(name = "value")
    private String value;
}
