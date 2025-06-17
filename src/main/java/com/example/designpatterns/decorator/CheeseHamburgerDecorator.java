package com.example.designpatterns.decorator;

import java.math.BigDecimal;

public class CheeseHamburgerDecorator extends HamburgerDecorator {

    private final Hamburger hamburger;

    public CheeseHamburgerDecorator(Hamburger baseHamburger) {
        super(baseHamburger);
        hamburger = baseHamburger;
    }

    @Override
    public BigDecimal price() {
        return hamburger.price().add(new BigDecimal("2.00"));
    }
}
