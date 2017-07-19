package template.barista;

/**
 * Created by xu on 13/07/2017.
 */
public class Coffee extends CoffeeBeverage{
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
