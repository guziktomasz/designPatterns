package pl.sda.javaCourse.designPatterns.creational.factoryMethod;

public class CommercialPlane extends AbstractPlan {
    @Override
    void getRate() {
        rate = 5.4;
    }
}
