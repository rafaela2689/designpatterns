package com.example.designpatterns.adapter;

import java.math.BigDecimal;

interface PriceCalculator {

    public BigDecimal getPrice(PriceCalculatorRequest priceCalculatorRequest);
}
