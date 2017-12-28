package factory.pizzaAF.Pizza_af;

import factory.pizzaAF.PizzaIngredientsf.PizzaIngredientsFactory;

/**
 * Created by xu on 2017/6/24.
 */
public class ClamPizza extends Pizza {
    PizzaIngredientsFactory factory;

    public ClamPizza(PizzaIngredientsFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        clam = factory.createClam();
    }
}
