package factory.pizzaAF.PizzaStore;

import factory.pizzaAF.PizzaIngredientsf.NYPizzaIngredientFactory;
import factory.pizzaAF.PizzaIngredientsf.PizzaIngredientsFactory;
import factory.pizzaAF.Pizza_af.*;

/**
 * Created by xu on 2017/6/24.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Pepperoni Pizza");
        } else
            return null;

        return pizza;
    }
}
