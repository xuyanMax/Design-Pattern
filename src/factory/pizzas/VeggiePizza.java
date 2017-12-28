package factory.pizzas;

/**
 * Created by xu on 2017/6/24.
 */
public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "Veggie Pizza_af";
        sauce = "Marinara Sauce";
        dough = "Crusts";
        toppings.add("Shredded Mozzarella");
        toppings.add("Grated Parmesan");
        toppings.add("Diced Onion");
        toppings.add("Sliced Mushrooms");
        toppings.add("Sliced Red Peppers");
        toppings.add("Sliced Black olives");


    }
}
