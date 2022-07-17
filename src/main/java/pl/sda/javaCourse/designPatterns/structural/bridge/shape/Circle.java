package pl.sda.javaCourse.designPatterns.structural.bridge.shape;

import pl.sda.javaCourse.designPatterns.structural.bridge.color.Color;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return color.fill() + " circle";
    }
}
