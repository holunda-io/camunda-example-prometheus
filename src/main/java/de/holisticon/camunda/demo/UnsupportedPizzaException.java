package de.holisticon.camunda.demo;

import static java.lang.String.format;

public class UnsupportedPizzaException extends RuntimeException {

    public UnsupportedPizzaException(String pizza) {
        super(format("Pizza %s is not supported", pizza));
    }
}
