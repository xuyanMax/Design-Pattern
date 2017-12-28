package factory.pizzafm;


/**
 * Created by xu on 2017/6/24.
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Deep Dish Veggie Pizza_af";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");


        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }
}
