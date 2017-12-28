package factory.pizzafm;

/**
 * Created by xu on 2017/6/24.
 */
public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza_af";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");

    }
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
