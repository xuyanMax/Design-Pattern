package factory.pizzaAF.PizzaStore;

import factory.pizzaAF.Pizza_af.Pizza;

/**
 * Created by xu on 2017/6/24.
 */
public abstract class PizzaStore {
    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("------Making a " + pizza.getName() + " ---------");

        //进行分类生产ingredients
        pizza.prepare();

        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
