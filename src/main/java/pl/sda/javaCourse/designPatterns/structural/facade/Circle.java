package pl.sda.javaCourse.designPatterns.structural.facade;

public class Circle implements Shape{
    @Override
    public String draw() {
        return "drawing circle";
    }
}
