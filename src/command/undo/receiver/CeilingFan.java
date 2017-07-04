package command.undo.receiver;

/**
 * Created by xu on 2017/6/29.
 */
public class CeilingFan {
    String location;
    int speed;
    public static final int  HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    public CeilingFan(String location) {
        this.location = location;
    }
    public void high() {
        /*turning the ceiling fan on to high */
        speed = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }
    public void medium() {
        /*turning the ceiling fan on to medium */
        speed = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");

    }

    public void low() {
        /*turning the ceiling fan on to high */
        speed = LOW;
        System.out.println(location + " ceiling fan is on low");

    }
    public void off() {
        speed = 0;
        System.out.println(location + " ceiling fan is off");
    }

    public int getSpeed() {
        return speed;
    }
}
