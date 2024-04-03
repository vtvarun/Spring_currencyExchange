package com.HumanCloudMicroservices.CurrencyExchange.Repository;

import com.HumanCloudMicroservices.CurrencyExchange.Models.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {


    @Query(value = "select * from currency_exchange WHERE country_from = :from and country_to = :to",nativeQuery = true)
    public CurrencyExchange getCurrencyExchangeRate(@Param("from") String from, @Param("to") String to);
}
