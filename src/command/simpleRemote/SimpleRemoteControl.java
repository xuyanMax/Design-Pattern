package command.simpleRemote;

/**
 * Created by xu on 2017/6/29.
 */
/*
简单的遥控器-只有一个按钮和对应的插槽
此类为调用者 invoker

*/
public class SimpleRemoteControl {
    Command slot;//有一个插槽持有命令
    public SimpleRemoteControl(){};

    /*用来设置插槽控制的命令，可以多次调用这个方法改变遥控器按钮的命令*/
    public void setCommand(Command command) {
        this.slot = command;
    }
    /*按下按钮，调用插槽的execute()方法*/
    public void buttonPressed() {
        slot.execute();
    }
}
