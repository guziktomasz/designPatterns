package pl.sda.javaCourse.designPatterns.behavioral.strategy;

import java.time.LocalDate;
import java.time.Month;

public class StrategyPicker {

    public static Dicounter discounter;

    public static Dicounter choseDiscounter(LocalDate date){
        Month month = date.getMonth();

        if (month.equals(Month.DECEMBER)) {
            discounter = new ChristmassDicounter();
        } else if (month.equals(Month.MARCH) || month.equals(Month.APRIL)) {
            discounter = new EasternDicounter();
        }
        return discounter;
    }
}
