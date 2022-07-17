package pl.sda.javaCourse.designPatterns.behavioral.templateMethod;

public class StandardComputerBuilder extends ComputerBuilder {
    @Override
    protected void addProcessor() {
        computerParts.put("processor", "standard processor");
    }

    @Override
    protected void setupMotherBoard() {

        motherBoardSetupStatus.add("Attaching standard mother board to the case");
        motherBoardSetupStatus.add("Plugging in the power");
    }

    @Override
    protected void addMotherBoard() {
        computerParts.put("motherboard", "standard motherboard");
    }
}
