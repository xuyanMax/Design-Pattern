package decorator.starbuzz.coffee;

/**
 * Created by xu on 2017/7/4.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
