package decorator.starbuzz.coffee;

/**
 * Created by xu on 2017/7/4.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
