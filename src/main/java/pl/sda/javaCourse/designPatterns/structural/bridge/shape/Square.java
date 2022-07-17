package pl.sda.javaCourse.designPatterns.structural.bridge.shape;

import pl.sda.javaCourse.designPatterns.structural.bridge.color.Color;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return color.fill() + " square";
    }
}
