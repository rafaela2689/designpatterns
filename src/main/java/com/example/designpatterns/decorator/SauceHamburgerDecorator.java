package com.example.designpatterns.decorator;

import java.math.BigDecimal;

public class SauceHamburgerDecorator extends HamburgerDecorator {

    private final Hamburger hamburger;

    public SauceHamburgerDecorator(Hamburger baseHamburger) {
        super(baseHamburger);
        hamburger = baseHamburger;
    }

    @Override
    public BigDecimal price() {
        return hamburger.price().add(new BigDecimal("1.50"));
    }
}
