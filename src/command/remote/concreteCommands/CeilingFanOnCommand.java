package command.remote.concreteCommands;

import command.remote.Command;
import command.remote.receiver.CeilingFan;

/**
 * Created by xu on 2017/6/30.
 */
public class CeilingFanOnCommand implements Command {
    CeilingFan cfan;

    public CeilingFanOnCommand(CeilingFan cfan) {
        this.cfan = cfan;
    }

    @Override
    public void execute() {
        cfan.high();
    }

}
