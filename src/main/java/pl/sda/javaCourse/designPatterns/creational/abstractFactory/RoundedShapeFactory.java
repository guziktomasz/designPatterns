package pl.sda.javaCourse.designPatterns.creational.abstractFactory;

public class RoundedShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case SQUARE:
                return new RoundedSquare();
            case RECTANGLE:
                return new RoundetRestangle();
            default:
                return null;
        }
    }
}