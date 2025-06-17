package com.example.designpatterns.decorator;

import java.math.BigDecimal;

/*
 Decorator is a structural design pattern.
 It's used when you want to add one or more functionalities to an object, without modifying its base object.
 The new features can be added in runtime and can be set as the client wants.
 1. Have an interface with the common behavior you want to add features;
 2. Have a concrete implementation of the interface as the base;
 3. Create a base decorator interface that implements the common behavior interface and has a reference to this interface, it calls the behavior of the interface;
 4. Create concrete implementations of the decorator interface that call the base behavior before or after the additional functionality.
 5. Client code create the decorator as it wants to add functionalities to the base object.
 */
public interface Hamburger {

    BigDecimal price();
}
