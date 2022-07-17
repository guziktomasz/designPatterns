package pl.sda.javaCourse.designPatterns.creational.abstractFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {

    @Test
    void shouldCreateRoundedSquare() {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(true);

        Shape shape = shapeFactory.getShape(ShapeType.SQUARE);
        String draw = shape.draw();
        System.out.println(draw);
    }

    @Test
    void shouldAngularSquare() {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape = shapeFactory.getShape(ShapeType.SQUARE);
        String draw = shape.draw();
        System.out.println(draw);
    }

    @Test
    void shouldCreateRectangle() {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape = shapeFactory.getShape(ShapeType.RECTANGLE);
        String draw = shape.draw();
        System.out.println(draw);

        assertEquals("rysuje prostokąt", draw);
    }
}