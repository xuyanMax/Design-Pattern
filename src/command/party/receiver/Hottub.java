package command.party.receiver;

/**
 * Created by xu on 2017/6/30.
 */
public class Hottub {
    boolean on;
    int temperature;

    public Hottub() {
    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public void circulate() {
        if (on)
            System.out.println("Hottub is bubbling");
    }

    public void jetOn() {
        if (on)
            System.out.println("Hottub jets are on");
    }

    public void jetOff() {
        if (!on)
            System.out.println("Hottub jets are off");
    }

    public void setTemperature(int t) {
        if (t > this.temperature)
            System.out.println("Hottub is heating to a steaming " + t + " degrees");
        else
            System.out.println("Hottub is cooling to " + t + " degrees");

        this.temperature = t;
    }

}
