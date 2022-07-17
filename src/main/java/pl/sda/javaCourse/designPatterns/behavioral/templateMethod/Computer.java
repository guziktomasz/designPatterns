package pl.sda.javaCourse.designPatterns.behavioral.templateMethod;

import java.util.Map;

public class Computer {

    public Computer(Map<String, String> computerPart) {
        this.computerPart = computerPart;
    }

    private Map<String, String> computerPart;

    public Map<String, String> getComputerPart() {
        return computerPart;
    }
}
