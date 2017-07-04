package command.party.concreteCommands;

import command.party.Command;
import command.party.receiver.TV;

/**
 * Created by xu on 2017/6/30.
 */
public class TVOnCommand implements Command {
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
        tv.setInputChannel();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
