package com.HumanCloudMicroservices.CurrencyExchange.Service;

import com.HumanCloudMicroservices.CurrencyExchange.Exceptions.CountryPairNotFound;
import com.HumanCloudMicroservices.CurrencyExchange.Models.CurrencyExchange;
import com.HumanCloudMicroservices.CurrencyExchange.Repository.CurrencyExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeService {

    @Autowired
    CurrencyExchangeRepository currencyExchangeRepository;

    @Autowired
    Environment environment;

    public CurrencyExchange addCurrencyExchange(String from, String to, Double rate) {

        CurrencyExchange currencyExchange = new CurrencyExchange();
        currencyExchange.setCountryFrom(from);
        currencyExchange.setCountryTo(to);
        currencyExchange.setConversionMultiple(rate);
        currencyExchange.setEnvironment(environment.getProperty("local.server.port"));

        currencyExchangeRepository.save(currencyExchange);

        return currencyExchange;
    }

    public CurrencyExchange getCurrencyExchangeRate(String from, String to) {
        CurrencyExchange currencyExchange = currencyExchangeRepository.getCurrencyExchangeRate(from,to);

        if(currencyExchange == null){
            throw new CountryPairNotFound("Country From and to Pair Not found in database, Please add the details in the database first");
        }

        return currencyExchange;
    }
}
