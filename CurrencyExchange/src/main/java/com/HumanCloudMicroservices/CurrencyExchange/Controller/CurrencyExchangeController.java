package com.HumanCloudMicroservices.CurrencyExchange.Controller;

import com.HumanCloudMicroservices.CurrencyExchange.Models.CurrencyExchange;
import com.HumanCloudMicroservices.CurrencyExchange.Service.CurrencyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @Autowired
    Environment environment;

    @Autowired
    CurrencyExchangeService currencyExchangeService;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange getCurrencyExchange(@PathVariable String from, @PathVariable String to){

        return currencyExchangeService.getCurrencyExchangeRate(from,to);
    }

    @PostMapping("/add-currency-exchange/from/{from}/to/{to}/rate/{rate}")
    public CurrencyExchange addCurrencyExchange(@PathVariable String from, @PathVariable String to, @PathVariable Double rate){
        return currencyExchangeService.addCurrencyExchange(from,to,rate);
    }
}
