package com.example.designpatterns.decorator;

import java.math.BigDecimal;

public class HamburgerDecorator implements Hamburger {

    private final Hamburger hamburger;

    public HamburgerDecorator(Hamburger baseHamburger) {
        hamburger = baseHamburger;
    }

    @Override
    public BigDecimal price() {
        return hamburger.price();
    }
}
