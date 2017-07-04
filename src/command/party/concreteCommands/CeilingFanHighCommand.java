package command.party.concreteCommands;


import command.party.Command;
import command.party.receiver.CeilingFan;

/**
 * Created by xu on 2017/6/30.
 */
public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    int preSpeed;//增加局部变量以便追踪吊扇之前的速度

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        preSpeed = ceilingFan.getSpeed();//在execute之前，先将它以前的状态记录起来，以便需要时候使用
        ceilingFan.high();
    }

    @Override
    /*将吊扇的速度设置回之前的值，以达到undo撤销的效果*/
    public void undo() {
        if (preSpeed == CeilingFan.HIGH)
            ceilingFan.high();
        else if (preSpeed == CeilingFan.MEDIUM)
            ceilingFan.medium();
        else if (preSpeed == CeilingFan.LOW)
            ceilingFan.low();
        else if (preSpeed == CeilingFan.OFF)
            ceilingFan.off();
    }
}
