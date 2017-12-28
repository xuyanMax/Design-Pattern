package factory.pizzaAF.PizzaIngredientsf;

import factory.pizzaAF.Cheese.Cheese;
import factory.pizzaAF.Cheese.MozzarellaCheese;
import factory.pizzaAF.Clam.Clam;
import factory.pizzaAF.Clam.FrozenClams;
import factory.pizzaAF.Dough.Dough;
import factory.pizzaAF.Dough.ThinCrustDough;
import factory.pizzaAF.Pepperoni.Pepperoni;
import factory.pizzaAF.Pepperoni.SlicedPepperoni;
import factory.pizzaAF.Sauce.PlumTomatoSauce;
import factory.pizzaAF.Sauce.Sauce;
import factory.pizzaAF.Veggies.BlackOlives;
import factory.pizzaAF.Veggies.Eggplant;
import factory.pizzaAF.Veggies.Spinach;
import factory.pizzaAF.Veggies.Veggies;

/**
 * Created by xu on 2017/6/24.
 */
public class ChicagoIngredientFactory implements PizzaIngredientsFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClams();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new Spinach(), new Eggplant()};
    }
}
