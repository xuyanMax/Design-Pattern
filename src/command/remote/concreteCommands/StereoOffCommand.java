package command.remote.concreteCommands;

import command.remote.Command;
import command.remote.receiver.Stereo;

/**
 * Created by xu on 2017/6/29.
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
