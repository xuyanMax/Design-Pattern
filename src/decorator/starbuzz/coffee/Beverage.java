package decorator.starbuzz.coffee;

/**
 * Created by xu on 2017/7/4.
 */
public abstract class Beverage {
    String description = "Unknown Description";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
