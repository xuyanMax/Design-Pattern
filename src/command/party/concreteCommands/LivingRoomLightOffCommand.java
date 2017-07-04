package command.party.concreteCommands;

import command.party.Command;
import command.party.receiver.Light;

/**
 * Created by xu on 2017/6/29.
 */
public class LivingRoomLightOffCommand implements Command {
    Light light;

    public LivingRoomLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();

    }
}
