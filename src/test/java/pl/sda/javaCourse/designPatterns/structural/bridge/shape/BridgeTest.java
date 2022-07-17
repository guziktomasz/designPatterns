package pl.sda.javaCourse.designPatterns.structural.bridge.shape;

import org.junit.jupiter.api.Test;
import pl.sda.javaCourse.designPatterns.structural.bridge.color.Blue;
import pl.sda.javaCourse.designPatterns.structural.bridge.color.Red;

import static org.junit.jupiter.api.Assertions.*;

class BridgeTest {
    @Test
    void shouldDrawRedCircle() {

        Shape circle = new Circle(new Red());

        System.out.println(circle.draw());

        assertEquals("Red circle", circle.draw());

    }

    @Test
    void shouldDrawBlueCircle() {

        Shape circle = new Circle(new Blue());

        System.out.println(circle.draw());

        assertEquals("Blue circle", circle.draw());
    }

    @Test
    void shouldDrawBlueSquare() {

        Shape square = new Square(new Blue());

        System.out.println(square.draw());

        assertEquals("Blue square", square.draw());
    }
}