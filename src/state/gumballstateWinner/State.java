package state.gumballstateWinner;

/**
 * Created by xu on 01/08/2017.
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
