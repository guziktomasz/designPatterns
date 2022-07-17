package pl.sda.javaCourse.designPatterns.structural.decorator;

public class BubbleLights extends TreeDecorator {


    public BubbleLights(ChristmassTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + addBubbleLightsDecoration();
    }

    private  String addBubbleLightsDecoration() {
        return "witch buuble lights";
    }
}
