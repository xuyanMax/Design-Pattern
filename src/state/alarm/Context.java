package state.alarm;

/**
 * Created by xu on 03/02/2018.
 */
public interface Context {
    void changeState(State state);
    void setClock(int hour);
    void callSecurityCenter(String msg);
    void recordLog(String msg);
}
