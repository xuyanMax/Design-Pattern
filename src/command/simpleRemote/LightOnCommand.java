package command.simpleRemote;

/**
 * Created by xu on 2017/6/29.
 */
public class LightOnCommand implements Command {/*这是一个命令对象，需要实现Command接口*/
    Light light;

    public LightOnCommand(Light light) {/*传入命令接收对象，记录在实例变量中。*/
        this.light = light;
    }

    @Override
    public void execute() {/*调用接收对象 light(电灯)的on()方法*/
        light.on();
    }

}
