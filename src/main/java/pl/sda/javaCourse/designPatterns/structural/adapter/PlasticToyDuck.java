package pl.sda.javaCourse.designPatterns.structural.adapter;

public class PlasticToyDuck implements ToyDuck {
    @Override
    public String getSqueakSound() {
        return "squeak";
    }
}
