package command.party;

/**
 * Created by xu on 2017/6/29.
 */
public interface Command {
    public void execute();
    public void undo();//新加入的undo
}
