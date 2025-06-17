package com.example.designpatterns.adapter;

import java.math.BigDecimal;

public class InHousePriceCalculatorImpl implements PriceCalculator {
    @Override
    public BigDecimal getPrice(PriceCalculatorRequest priceCalculatorRequest) {
        return BigDecimal.valueOf(
                priceCalculatorRequest.distance().km() * priceCalculatorRequest.fareConfiguration().pricePerKm()
        );
    }
}
