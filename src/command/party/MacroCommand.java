package command.party;

/**
 * Created by xu on 2017/6/30.
 */
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i=0; i<commands.length; i++)
            commands[i].execute();
    }

    @Override
    public void undo() {
        for (int i=0; i<commands.length; i++)
            commands[i].undo();
    }
}
