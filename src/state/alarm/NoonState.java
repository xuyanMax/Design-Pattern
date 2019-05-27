package state.alarm;

/**
 * Created by xu on 04/02/2018.
 */
public class NoonState implements State {

    private static NoonState OurInstance = new NoonState();
    public static NoonState getInstance(){
        return OurInstance;
    }
    private NoonState() {
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour>=9 && hour < 13 || hour>=13 && hour<17)
            context.changeState(DayState.getInstance());
        else if (hour<9 || hour>17)
            context.changeState(NightState.getInstance());
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("午间使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("午间按下警铃");
        //context.changeState(UrgentState.getInstance());
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("午间通话");
    }

    @Override
    public String toString() {
        return "[午间]";
    }
}
