package command.simpleRemote;

/**
 * Created by xu on 2017/6/29.
 */
public class GarageDoor {
    public GarageDoor() {
    }
    public void up() {
        System.out.println("Garage door is open");
    }
    public void down() {
        System.out.println("Garage door is closed");
    }
    public void stop() {
        System.out.println("Garage door is stopped");
    }
    public void lightOn() {
        System.out.println("Garage light is on");
    }
    public void lightOff() {
        System.out.println("Garage light is off");
    }



}
