package command.remote.concreteCommands;

import command.remote.Command;
import command.remote.receiver.GarageDoor;

/**
 * Created by xu on 2017/6/29.
 */
public class GarageUpCommand implements Command {
    GarageDoor gd;

    public GarageUpCommand(GarageDoor gd) {
        this.gd = gd;
    }

    @Override
    public void execute() {
        gd.up();
    }
}
