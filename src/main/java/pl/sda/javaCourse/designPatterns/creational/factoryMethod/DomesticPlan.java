package pl.sda.javaCourse.designPatterns.creational.factoryMethod;

public class DomesticPlan extends AbstractPlan {
    @Override
    void getRate() {
        rate = 3.7;
    }
}
