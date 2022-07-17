package pl.sda.javaCourse.designPatterns.behavioral.templateMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ComputerBuilder {

    protected Map<String, String> computerParts = new HashMap<>();
    protected List<String> motherBoardSetupStatus = new ArrayList<>();

    //template method
    public final Computer buildComputer(){
        addMotherBoard();
        setupMotherBoard();
        addProcessor();

        return new Computer(computerParts);
    }

    protected abstract void addProcessor();

    protected abstract void setupMotherBoard();

    protected abstract void addMotherBoard();

    public Map<String, String> getComputerParts() {
        return computerParts;
    }

    public void setComputerParts(Map<String, String> computerParts) {
        this.computerParts = computerParts;
    }

    public List<String> getMotherBoardSetupStatus() {
        return motherBoardSetupStatus;
    }

    public void setMotherBoardSetupStatus(List<String> motherBoardSetupStatus) {
        this.motherBoardSetupStatus = motherBoardSetupStatus;
    }
}
