package command.party.concreteCommands;

import command.party.Command;
import command.party.receiver.Hottub;

/**
 * Created by xu on 2017/6/30.
 */
public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.setTemperature(98);
        hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
    }
}
