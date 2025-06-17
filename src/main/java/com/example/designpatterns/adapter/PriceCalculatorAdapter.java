package com.example.designpatterns.adapter;

import java.math.BigDecimal;

public class PriceCalculatorAdapter implements PriceCalculator {

    private final ThirdPartyPriceCalculator thirdPartyPriceCalculator;

    public PriceCalculatorAdapter(ThirdPartyPriceCalculator thirdPartyPriceCalculator) {
        this.thirdPartyPriceCalculator = thirdPartyPriceCalculator;
    }

    @Override
    public BigDecimal getPrice(PriceCalculatorRequest priceCalculatorRequest) {
        return this.thirdPartyPriceCalculator.calculatePrice(
                priceCalculatorRequest.distance().km(),
                priceCalculatorRequest.fareConfiguration().pricePerKm());
    }
}
