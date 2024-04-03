package com.HumanCloudMicroservices.CurrencyExchange.Exceptions;

public class CountryPairNotFound extends RuntimeException{

    public CountryPairNotFound(String message) {
        super(message);
    }
}
