package decorator.starbuzz.decorator;

import decorator.starbuzz.coffee.Beverage;

/**
 * Created by xu on 2017/7/4.
 */
public abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription();
}
