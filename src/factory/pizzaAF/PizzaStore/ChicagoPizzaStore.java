package factory.pizzaAF.PizzaStore;

import factory.pizzaAF.PizzaIngredientsf.ChicagoIngredientFactory;
import factory.pizzaAF.PizzaIngredientsf.PizzaIngredientsFactory;
import factory.pizzaAF.Pizza_af.*;

/**
 * Created by xu on 2017/6/24.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientFactory = new ChicagoIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Pepperoni Pizza");
        } else
            return null;

        return pizza;
    }
}
