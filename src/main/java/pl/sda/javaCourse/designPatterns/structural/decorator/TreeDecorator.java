package pl.sda.javaCourse.designPatterns.structural.decorator;

public abstract class TreeDecorator implements ChristmassTree{

    private ChristmassTree tree;

    public TreeDecorator(ChristmassTree tree) {
        this.tree = tree;
    }


    @Override
    public String decorate() {
        return tree.decorate();
    }
}
