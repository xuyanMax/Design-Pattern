package state.alarm;

/**
 * Created by xu on 03/02/2018.
 */
public class NightState implements State {
    private static NightState ourInstance = new NightState();

    public static NightState getInstance(){
        return ourInstance;
    }
    private NightState() {
    }

    @Override
    public void doClock(Context context, int hour) {
        if ((hour >= 12 && hour<13))
            context.changeState(NoonState.getInstance());
        else if (hour>9 && hour<17)
            context.changeState(DayState.getInstance());
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("夜间紧急使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("夜间按下警铃");
        //context.changeState(UrgentState.getInstance());
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("夜间通话");
    }

    @Override
    public String toString() {
        return "[晚上]";
    }
}
