package command.party.concreteCommands;

import command.party.Command;
import command.party.receiver.Stereo;

/**
 * Created by xu on 2017/6/30.
 */
public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
