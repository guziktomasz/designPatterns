package pl.sda.javaCourse.designPatterns.structural.facade;

public class Rectangle implements Shape{
    @Override
    public String draw() {
        return "drawing rectangle";
    }
}
