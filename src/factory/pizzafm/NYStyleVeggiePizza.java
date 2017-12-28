package factory.pizzafm;

/**
 * Created by xu on 2017/6/24.
 */
public class NYStyleVeggiePizza extends Pizza{

    public NYStyleVeggiePizza() {
        name = "Ny Style Veggie pizza";
        dough ="Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
