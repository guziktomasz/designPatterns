package pl.sda.javaCourse.designPatterns.behavioral.command.command;

import pl.sda.javaCourse.designPatterns.behavioral.command.receiver.TextFile;

public class SaveTextFileCommand implements TextFileCommand {

    private TextFile textFile;

    public SaveTextFileCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}
