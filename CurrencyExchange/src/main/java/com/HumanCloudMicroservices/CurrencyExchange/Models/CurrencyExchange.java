package com.HumanCloudMicroservices.CurrencyExchange.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class CurrencyExchange {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String countryFrom;

    private String countryTo;

    private Double conversionMultiple;

    private String environment;

    public String getEnvironment() {
        return environment;
    }

    public String getCountryFrom() {
        return countryFrom;
    }

    public void setCountryFrom(String countryFrom) {
        this.countryFrom = countryFrom;
    }

    public String getCountryTo() {
        return countryTo;
    }

    public void setCountryTo(String countryTo) {
        this.countryTo = countryTo;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public CurrencyExchange(){

    }

    public CurrencyExchange(Long id, String countryFrom, String countryTo, Double conversionMultiple, String environment) {
        this.id = id;
        this.countryFrom = countryFrom;
        this.countryTo = countryTo;
        this.conversionMultiple = conversionMultiple;
        this.environment = environment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }





    public Double getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(Double conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }
}
