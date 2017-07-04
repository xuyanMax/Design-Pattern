package command.remote.concreteCommands;

import command.remote.Command;
import command.remote.receiver.CeilingFan;

/**
 * Created by xu on 2017/6/30.
 */
public class CeilingFanOffCommand implements Command{
    CeilingFan cfan;

    public CeilingFanOffCommand(CeilingFan cfan) {
        this.cfan = cfan;
    }

    @Override
    public void execute() {
        cfan.off();
    }
}
