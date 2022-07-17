package pl.sda.javaCourse.designPatterns.structural.facade;

import java.util.Arrays;
import java.util.List;

public class ShapesDrawer {

    private Shape circle = new Circle();
    private Shape rectangle = new Rectangle();
    private Shape square = new Square();

    public String drawCircle(){
        return circle.draw();
    }

    public String drawRectangle(){
        return rectangle.draw();
    }

    public String drawSquare(){
        return square.draw();
    }

    public String drawShapes(){
        List<String> drawers = Arrays.asList(
                circle.draw(),
                rectangle.draw(),
                square.draw());
        String join = String.join(",", drawers);
        return join;
    }

}
