package factory.pizzas;

/**
 * Created by xu on 2017/6/24.
 */
public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese Pizza_af";
        sauce = "Marinara Pizza_af Sauce";
        dough = "Regular Crusts";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
