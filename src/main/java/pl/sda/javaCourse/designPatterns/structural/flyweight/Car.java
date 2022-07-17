package pl.sda.javaCourse.designPatterns.structural.flyweight;

import java.awt.*;

public class Car implements Vehicle {

    private Color color;


    @Override
    public Color getColor() {
        return this.color;
    }
}
