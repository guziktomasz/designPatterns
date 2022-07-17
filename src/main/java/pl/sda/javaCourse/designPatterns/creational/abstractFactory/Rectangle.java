package pl.sda.javaCourse.designPatterns.creational.abstractFactory;

public class Rectangle implements Shape{
    @Override
    public String draw() {
        return "rysuje prostokąt";
    }
}
