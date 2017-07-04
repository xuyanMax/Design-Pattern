package command.party.concreteCommands;


import command.party.Command;

import command.party.receiver.Stereo;


/**
 * Created by xu on 2017/6/29.
 */
public class StereoOnwithCDCommand implements Command {
    Stereo stereo;

    public StereoOnwithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
