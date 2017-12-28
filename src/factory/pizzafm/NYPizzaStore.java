package factory.pizzafm;

/**
 * Created by xu on 2017/6/24.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese"))
            return new NYStyleCheesePizza();
        else if (item.equals("clam"))
            return new NYStyleClamPizza();
        else if (item.equals("veggie"))
            return new NYStyleVeggiePizza();
        else if (item.equals("pepperoni"))
            return new NYStylePepperoniPizza();
        else return null;
    }
}
