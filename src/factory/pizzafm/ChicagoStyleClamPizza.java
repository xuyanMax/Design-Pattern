package factory.pizzafm;

/**
 * Created by xu on 2017/6/24.
 */
public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza_af";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
