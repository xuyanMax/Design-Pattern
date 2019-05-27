package state.alarm;

/**
 * Created by xu on 03/02/2018.
 */
public interface State {
    void doClock(Context context, int hour);//设置白昼时间
    void doUse(Context context);//使用金库
    void doAlarm(Context context);//按下警铃
    void doPhone(Context context);//正常通话

}
