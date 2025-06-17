package com.example.designpatterns.decorator;

import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    public void testDecoratorPattern() {
        Hamburger baseHamburger = new BaseHamburger();
        SauceHamburgerDecorator sauceHamburgerDecorator = new SauceHamburgerDecorator(new CheeseHamburgerDecorator(baseHamburger));

        System.out.println("Base hamburger price: " + baseHamburger.price());
        System.out.println("Final hamburger price: " + sauceHamburgerDecorator.price());
    }
}
