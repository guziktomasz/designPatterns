package pl.sda.javaCourse.designPatterns.behavioral.templateMethod;

public class HighEndComputerBuilder extends ComputerBuilder{

    @Override
    protected void addProcessor() {
        computerParts.put("processor", "super processpr");
    }

    @Override
    protected void setupMotherBoard() {
        motherBoardSetupStatus.add("Attaching SUPER mother board to the case");
        motherBoardSetupStatus.add("Plugging in the SUPER power");
    }

    @Override
    protected void addMotherBoard() {

        computerParts.put("motherboard", "super motherboard");

    }
}
