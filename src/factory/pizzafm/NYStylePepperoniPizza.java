package factory.pizzafm;

/**
 * Created by xu on 2017/6/24.
 */
public class NYStylePepperoniPizza extends Pizza{
    public NYStylePepperoniPizza() {
        name = "Ny Style Pepperoni pizza";
        dough ="Thin Crust Dough";
        sauce = "Marinara Sauce";

        //糕点上的装饰配料
        toppings.add("Grated Reggiano Cheese");
        toppings.add("Sliced Pepperoni");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
