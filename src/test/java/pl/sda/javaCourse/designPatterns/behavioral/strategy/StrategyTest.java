package pl.sda.javaCourse.designPatterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class StrategyTest {

    @Test
    void shouldUseEasterDiscount(){
        Dicounter easterDiscouter = new EasternDicounter();
        BigDecimal amountWithDiscount = easterDiscouter.applyDiscount(BigDecimal.valueOf(100));

        System.out.println(amountWithDiscount);

        assertEquals(BigDecimal.valueOf(50d), amountWithDiscount);

    }

}