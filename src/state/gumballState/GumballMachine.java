package state.gumballState;

/**
 * Created by xu on 01/08/2017.
 */
public class GumballMachine {
    State NoQuarterState;
    State HasQuarterState;
    State SoldOutState;
    State SoldState;

    State state = SoldOutState;
    int count = 0;

    public GumballMachine(int numGumball) {
        this.count = numGumball;
        NoQuarterState = new NoQuarterState(this);
        HasQuarterState = new HasQuarterState(this);
        SoldOutState = new SoldOutState(this);
        SoldState = new SoldState(this);

        this.count = numGumball;

        if (numGumball > 0)
            state = NoQuarterState;
    }
    public void insertQuarter() {
        state.insertQuarter();
    }
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    public  void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public void refill(int count) {
        this.count = count;
        state = NoQuarterState;
    }
    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public State getNoQuarterState() {
        return NoQuarterState;
    }

    public State getHasQuarterState() {
        return HasQuarterState;
    }

    public State getSoldOutState() {
        return SoldOutState;
    }

    public State getSoldState() {
        return SoldState;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
