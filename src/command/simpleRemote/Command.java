package command.simpleRemote;

/**
 * Created by xu on 2017/6/29.
 */
/*所有的命令对象都实现该接口，只有一个命令方法*/
public interface Command {
    public void execute();
}
