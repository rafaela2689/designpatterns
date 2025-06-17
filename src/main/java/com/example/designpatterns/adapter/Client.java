package com.example.designpatterns.adapter;

import java.math.BigDecimal;

/**
 * Adapter is a structural design pattern
 * It's used when you have incompatible interfaces,
 * for instance integration of existing code, reuse of existing functionalities, third party libraries, interoperability
 * To solve that an adapter is created, which will act as a translation layer or a bridge between the incompatible interface
 * and your current code interface
 * The Adapter class will have a reference to the concrete implementation (adaptee)
 * and it will call the interface that was not compatible after doing the necessaries modifications to be able to do so
 */
public class Client {

    private final PriceCalculator priceCalculator;

    public Client(PriceCalculator priceCalculator) {
        this.priceCalculator = priceCalculator;
    }

    public BigDecimal showPrice(PriceCalculatorRequest request) {
        return this.priceCalculator.getPrice(request);
    }

    public static void main(String[] args) {
        PriceCalculatorRequest request = new PriceCalculatorRequest(
                new Coordinate(122345L, 122334L),
                new Distance(7L),
                new FareConfiguration(1L)
        );

        final PriceCalculator priceCalculator = new InHousePriceCalculatorImpl();
        final Client client = new Client(priceCalculator);
        System.out.println("### In House price calculator ###");
        System.out.println(client.showPrice(request));

        final ThirdPartyPriceCalculator thirdPartyPriceCalculator = new ThirdPartyPriceCalculator();
        final PriceCalculator priceCalculator2 = new PriceCalculatorAdapter(thirdPartyPriceCalculator);
        final Client client2 = new Client(priceCalculator2);
        System.out.println("### Third party price calculator ###");
        System.out.println(client2.showPrice(request));
    }

}
