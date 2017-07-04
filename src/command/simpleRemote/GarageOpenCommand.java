package command.simpleRemote;

/**
 * Created by xu on 2017/6/29.
 */
public class GarageOpenCommand implements Command{

    GarageDoor gd;

    public GarageOpenCommand(GarageDoor gd) {
        this.gd = gd;
    }

    @Override
    public void execute() {
        gd.up();
    }
}
