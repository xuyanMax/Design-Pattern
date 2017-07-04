package command.remote;

import command.remote.concreteCommands.NoCommand;

/**
 * Created by xu on 2017/6/29.
 */
/*
* This is the Invoker  遥控器
* */
public class RemoteControl {
    /*遥控器要处理7个开与关的指令*/
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        /*在构造器中，需要实例化这两个开与关的数组*/
        onCommands = new Command[7];
        offCommands = new Command[7];

        /*空对象 null object, 当你不想返回一个有意义的对象时，空对象很有用
        * 客户也可以将处理null的责任转移给空对象
        *
        * 举例来说，遥控器不可能一出厂就设置了有意义的命令对象，所以提供了NoCommand对象作为替代品，当调用它的execute(),它什么都不做
        * */
        Command noCommand = new NoCommand();
        for (int i=0; i<7; i++) {
            /*每个插槽里都预先指定成NoCommand对象，以便确定每个插槽永远都有对象
            *
            * 避免检查
            * if (onCommand[i]!=null)
            *   onCommand[i].execute()
            *
            * */
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;

    }
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("----------Remote Control----------\n");
        for (int i=0; i<onCommands.length; i++) {
            builder.append("[slot " + i + onCommands[i].getClass().getName()+"   "
                    + offCommands[i].getClass().getName() + "\n");
        }
        return builder.toString();

    }
}
