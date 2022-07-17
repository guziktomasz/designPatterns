package pl.sda.javaCourse.designPatterns.behavioral.strategy;

import java.math.BigDecimal;

public class ChristmassDicounter implements Dicounter {

    private final BigDecimal DISCOUNT = BigDecimal.valueOf(0.9);

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(DISCOUNT);
    }
}
