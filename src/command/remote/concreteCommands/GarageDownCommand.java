package command.remote.concreteCommands;

import command.remote.Command;
import command.remote.receiver.GarageDoor;

/**
 * Created by xu on 2017/6/29.
 */
public class GarageDownCommand implements Command {
    GarageDoor gd;

    public GarageDownCommand(GarageDoor gd) {
        this.gd = gd;
    }

    @Override
    public void execute() {
        gd.down();
    }

}
