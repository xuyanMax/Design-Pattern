package state.alarm;

/**
 * Created by xu on 03/02/2018.
 */
public class DayState implements State {
    private static DayState ourInstance = new DayState();

    public static DayState getInstance() {
        return ourInstance;
    }

    private DayState() {
    }
    @Override
    public void doClock(Context context, int hour) {
        if (hour <9 && hour >= 17)
            context.changeState(NightState.getInstance());
        else if (hour>=12 && hour<13)
            context.changeState(NoonState.getInstance());
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("白天使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("白天按下警铃");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("白天通话");
    }

    @Override
    public String toString() {
        return "[白天]";
    }
}
