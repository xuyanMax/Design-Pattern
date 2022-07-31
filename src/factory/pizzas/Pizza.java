package factory.pizzas;

import java.util.ArrayList;

/**
 * Created by xu on 2017/6/24.
 */
public class Pizza {
    //无constructor
    public String name;
    public String dough;
    public String sauce;
    ArrayList toppings = new ArrayList();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
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
