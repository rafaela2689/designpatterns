package com.example.designpatterns.adapter;

public record PriceCalculatorRequest(Coordinate coordinate,
                                     Distance distance,
                                     FareConfiguration fareConfiguration
) {}
