package command.remote.concreteCommands;

import command.remote.Command;
import command.remote.receiver.Light;

/**
 * Created by xu on 2017/6/29.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
