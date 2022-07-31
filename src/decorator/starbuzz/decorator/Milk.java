package decorator.starbuzz.decorator;

import decorator.starbuzz.coffee.Beverage;

/**
 * Created by xu on 2017/7/4.
 */
public class Milk extends CondimentDecorator{
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.5 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return "Adding Milk.";
    }
}
