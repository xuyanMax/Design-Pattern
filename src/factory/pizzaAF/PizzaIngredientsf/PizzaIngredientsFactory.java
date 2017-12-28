package factory.pizzaAF.PizzaIngredientsf;

import factory.pizzaAF.Cheese.Cheese;
import factory.pizzaAF.Clam.Clam;
import factory.pizzaAF.Dough.Dough;
import factory.pizzaAF.Pepperoni.Pepperoni;
import factory.pizzaAF.Sauce.Sauce;
import factory.pizzaAF.Veggies.Veggies;

/**
 * Created by xu on 2017/6/24.
 */
public interface PizzaIngredientsFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Pepperoni createPepperoni();
    public Clam createClam();
    public Veggies[] createVeggies();
}
