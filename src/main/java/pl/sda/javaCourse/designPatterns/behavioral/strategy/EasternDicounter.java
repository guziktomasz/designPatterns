package pl.sda.javaCourse.designPatterns.behavioral.strategy;

import java.math.BigDecimal;

public class EasternDicounter implements Dicounter {

    private final BigDecimal DISCOUNT = BigDecimal.valueOf(0.5);

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(DISCOUNT);
    }
}
