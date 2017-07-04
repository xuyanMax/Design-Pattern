package command.remote.concreteCommands;


import command.remote.Command;
import command.remote.receiver.Light;

/**
 * Created by xu on 2017/6/29.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
