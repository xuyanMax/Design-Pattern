package factory.pizzafm;

/**
 * Created by xu on 2017/6/24.
 */
public class NYStyleClamPizza extends Pizza{
    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza_af";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Clams from Long Island Sound");

    }
}
