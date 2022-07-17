package pl.sda.javaCourse.designPatterns.behavioral.templateMethod;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TemplateMethodTest {

    private final String motherboard = "motherboard";
    private final String processor = "processor";

    @Test
    void shouldBuildStandardComputer(){
        ComputerBuilder standardComputerBuilder = new StandardComputerBuilder();
        Computer computer = standardComputerBuilder.buildComputer();

        Map<String, String> computerParts = computer.getComputerPart();
        System.out.println(computerParts);

        assertEquals("standard motherboard", computerParts.get(motherboard));
        assertEquals("standard processor", computerParts.get(processor));
    }

    @Test
    void shouldBuildHightEndComputer(){
        ComputerBuilder hightEndComputerBuilder = new HighEndComputerBuilder();
        Computer computer= hightEndComputerBuilder.buildComputer();

        Map<String, String> computerParts = computer.getComputerPart();
        System.out.println(computerParts);

        assertEquals("super motherboard", computerParts.get(motherboard));
        assertEquals("super processpr", computerParts.get(processor));
    }

}