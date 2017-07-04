package command.remote.receiver;

/**
 * Created by xu on 2017/6/29.
 */
public class CeilingFan {
    String location;
    int level;
    public static final int  HIGH = 2;
    public static final int MEDIUM = 1;
    public static final int LOW = 0;

    public CeilingFan(String location) {
        this.location = location;
    }
    public void high() {
        /*turning the ceiling fan on to high */
        level = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }
    public void medium() {
        /*turning the ceiling fan on to medium */
        level = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");

    }

    public void low() {
        /*turning the ceiling fan on to high */
        level = LOW;
        System.out.println(location + " ceiling fan is on low");

    }
    public void off() {
        level = 0;
        System.out.println(location + " ceiling fan is off");
    }

}
