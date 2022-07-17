package pl.sda.javaCourse.designPatterns.behavioral.command.invoker;

import pl.sda.javaCourse.designPatterns.behavioral.command.command.TextFileCommand;

public class TextFileCommandExecuter {

    public String executeCommand(TextFileCommand textFileCommand) {
        return textFileCommand.execute();
    }

}
