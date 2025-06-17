package com.example.designpatterns.decorator;

import java.math.BigDecimal;

public class BaseHamburger implements Hamburger {
    @Override
    public BigDecimal price() {
        return new BigDecimal("10.0");
    }
}
