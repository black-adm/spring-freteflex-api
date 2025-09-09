package com.syscode42.freteflex.service;

import com.syscode42.freteflex.domain.ExpressShippingCalculator;
import com.syscode42.freteflex.domain.StandardShippingCalculator;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    private final StandardShippingCalculator standardShippingCalculator;
    private final ExpressShippingCalculator expressShippingCalculator;

    public ShippingService(StandardShippingCalculator standardShippingCalculator,
                           ExpressShippingCalculator expressShippingCalculator) {
        this.standardShippingCalculator = standardShippingCalculator;
        this.expressShippingCalculator = expressShippingCalculator;
    }

    public Double calculate(String shippingType, Double distance, Double weight) {
        if (shippingType.equalsIgnoreCase("standard")) {
            return standardShippingCalculator.calculate(distance, weight);
        }

        if (shippingType.equalsIgnoreCase("express")) {
            return expressShippingCalculator.calculate(distance, weight);
        }

        return null;
    }

}
