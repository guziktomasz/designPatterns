package pl.sda.javaCourse.designPatterns.behavioral.command;

import org.junit.jupiter.api.Test;
import pl.sda.javaCourse.designPatterns.behavioral.command.command.OpenTextFileCommand;
import pl.sda.javaCourse.designPatterns.behavioral.command.command.SaveTextFileCommand;
import pl.sda.javaCourse.designPatterns.behavioral.command.command.TextFileCommand;
import pl.sda.javaCourse.designPatterns.behavioral.command.invoker.TextFileCommandExecuter;
import pl.sda.javaCourse.designPatterns.behavioral.command.receiver.TextFile;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {

    private final String NAME = "Podanie";

    @Test
    void shouldOpenTextFile(){
        TextFileCommand openTextFileCommandtextFileCommand = new OpenTextFileCommand(new TextFile(NAME));
        TextFileCommandExecuter textFileCommandExecuter = new TextFileCommandExecuter();
        String result = textFileCommandExecuter.executeCommand(openTextFileCommandtextFileCommand);
        System.out.println(result);

        assertEquals("opening file Podanie", result);
    }

    @Test
    void shouldSaveTextFile(){
        TextFileCommand saveTextFileCommandtextFileCommand = new SaveTextFileCommand(new TextFile(NAME));
        TextFileCommandExecuter textFileCommandExecuter = new TextFileCommandExecuter();
        String result = textFileCommandExecuter.executeCommand(saveTextFileCommandtextFileCommand);
        System.out.println(result);

        assertEquals("saving file " + NAME, result);
    }

}