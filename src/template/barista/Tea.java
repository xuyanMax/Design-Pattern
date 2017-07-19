package template.barista;

/**
 * Created by xu on 13/07/2017.
 */
public class Tea extends CoffeeBeverage {
    @Override
    void brew() {
        System.err.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.err.println("Adding lemon");
    }

}
