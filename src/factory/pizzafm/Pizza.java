package factory.pizzafm;

import java.util.ArrayList;

/**
 * Created by xu on 2017/6/24.
 */
public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
    ArrayList toppings = new ArrayList();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.err.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++)
            System.err.println("  " + toppings.get(i));
        System.out.println("-------------------");
    }

    public void bake() {
        System.out.println("Baking for 25 min at 350");
        System.out.println("-------------------");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
        System.out.println("-------------------");
    }

    public void box() {
        System.out.println("Boxing pizza in official PizzaStore box");
    }

    @Override

    public String toString() {
        // code to display pizza name and ingredients

        StringBuilder builder = new StringBuilder();
        builder.append("---" + name + "---\n");
        builder.append(dough + "\n");
        builder.append(sauce + "\n");
        for (int i = 0; i < toppings.size(); i++)
            builder.append((String) toppings.get(i) + "\n");

        return builder.toString();
    }
}
