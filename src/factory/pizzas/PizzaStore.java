package factory.pizzas;

/**
 * Created by xu on 2017/6/24.
 */
public class PizzaStore {
    SimplePizzaFactory factory = new SimplePizzaFactory();

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);


        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }
}
