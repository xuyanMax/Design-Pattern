package command.undo.concreteCommands;


import command.undo.Command;
import command.undo.receiver.Light;

/**
 * Created by xu on 2017/6/29.
 */
public class LightOffCommand implements Command {
    Light light;
    int level;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        level = light.getLevel();
        light.off();
    }
    public void undo() {
        light.dim(level);
    }
}
