package command.party.concreteCommands;

import command.party.Command;
import command.party.receiver.TV;

/**
 * Created by xu on 2017/6/30.
 */
public class TVOffCommand implements Command {
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
