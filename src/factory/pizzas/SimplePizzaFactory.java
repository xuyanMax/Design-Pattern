package factory.pizzas;

/**
 * Created by xu on 2017/6/24.
 */
public class SimplePizzaFactory {


    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("CheesePizza"))
            pizza = new CheesePizza();
        else if (type.equals("ClamPizza"))
            pizza = new ClamPizza();
        else if (type.equals("VeggiePizza"))
            pizza = new VeggiePizza();

        return pizza;
    }
}
