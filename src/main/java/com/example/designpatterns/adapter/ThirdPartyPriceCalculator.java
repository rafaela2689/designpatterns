package com.example.designpatterns.adapter;

import java.math.BigDecimal;

public class ThirdPartyPriceCalculator {

    public BigDecimal calculatePrice(Long distanceKm, Long pricePerKm) {
        return BigDecimal.valueOf(distanceKm * pricePerKm);
    }
}
