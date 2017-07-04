package decorator.starbuzz.coffee;

import decorator.starbuzz.coffee.Beverage;

/**
 * Created by xu on 2017/7/4.
 */
public class HouseBlend extends Beverage {
    String description = "House Blend Coffee";
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
