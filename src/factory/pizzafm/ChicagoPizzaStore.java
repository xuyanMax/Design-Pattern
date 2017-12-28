package factory.pizzafm;

/**
 * Created by xu on 2017/6/24.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese"))
            return new ChicagoStyleCheesePizza();
        else if (item.equals("clam"))
            return new ChicagoStyleClamPizza();
        else if (item.equals("veggie"))
            return new ChicagoStyleVeggiePizza();
        else if (item.equals("pepperoni"))
            return new ChicagoStylePepperoniPizza();
        else return null;
    }
}
