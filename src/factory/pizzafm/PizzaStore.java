package factory.pizzafm;

/**
 * Created by xu on 2017/6/24.
 */
public abstract class PizzaStore {

    abstract public Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("-------Making a Pizza_af--------");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
