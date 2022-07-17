package pl.sda.javaCourse.designPatterns.behavioral.strategy;

import java.math.BigDecimal;

public interface Dicounter {
    BigDecimal applyDiscount(BigDecimal amount);
}
