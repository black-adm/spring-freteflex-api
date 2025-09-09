package com.syscode42.freteflex.domain;

import org.springframework.stereotype.Component;

@Component
public class ExpressShippingCalculator implements ShippingCalculator {

    public Double calculate(Double distance, Double weight) {
        return weight * 1.5 + distance * 0.75;
    }
}
