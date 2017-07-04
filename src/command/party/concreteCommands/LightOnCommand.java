package command.party.concreteCommands;


import command.party.Command;
import command.party.receiver.Light;

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

    @Override
    public void undo() {
        light.off();
    }
}
