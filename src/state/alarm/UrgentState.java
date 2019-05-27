package state.alarm;

/**
 * Created by xu on 04/02/2018.
 */
public class UrgentState implements State {
    private static State instance = new UrgentState();
    public static State getInstance(){
        return instance;
    }
    private UrgentState() {
    }

    @Override
    public void doClock(Context context, int hour) {
        // 与时间无关
        //一旦进入紧急，无法回复正常
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("紧急：紧急使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("紧急：紧急按下警铃");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("紧急：紧急呼叫警报中心");
    }

    @Override
    public String toString() {
        return "[紧急]";
    }
}
