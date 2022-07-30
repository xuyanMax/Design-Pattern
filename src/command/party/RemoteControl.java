package command.party;

import command.party.concreteCommands.NoCommand;

/**
 * Created by xu on 2017/6/30.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        undoCommand = noCommand;

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        undoCommand = onCommands[slot];
        onCommands[slot].execute();

    }

    public void offButtonWasPushed(int slot) {
        undoCommand = offCommands[slot];
        offCommands[slot].execute();
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("----------Remote Control----------\n");
        for (int i = 0; i < onCommands.length; i++) {
            builder.append("[slot " + i + onCommands[i].getClass().getName() + "   "
                    + offCommands[i].getClass().getName() + "\n");
        }
        return builder.toString();

    }
}
