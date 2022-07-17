package pl.sda.javaCourse.designPatterns.structural.decorator;

public class Garland extends TreeDecorator{


    public Garland(ChristmassTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + addGarlandDecoration();
    }

    private String addGarlandDecoration(){
        return "with garland";
    }
}
