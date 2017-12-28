package factory.pizzaAF.PizzaIngredientsf;

import factory.pizzaAF.Cheese.Cheese;
import factory.pizzaAF.Cheese.ReggianoCheese;
import factory.pizzaAF.Clam.Clam;
import factory.pizzaAF.Clam.FreshClams;
import factory.pizzaAF.Dough.Dough;
import factory.pizzaAF.Dough.ThinCrustDough;
import factory.pizzaAF.Pepperoni.Pepperoni;
import factory.pizzaAF.Pepperoni.SlicedPepperoni;
import factory.pizzaAF.Sauce.MarinaraSauce;
import factory.pizzaAF.Sauce.Sauce;
import factory.pizzaAF.Veggies.*;

/**
 * Created by xu on 2017/6/24.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientsFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClams();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] {
                new Garlic(),
                new Onion(),
                new MushRoom(),
                new RedPepper()
        };
    }
}
