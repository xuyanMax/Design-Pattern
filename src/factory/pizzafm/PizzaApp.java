package factory.pizzafm;

/**
 * Created by xu on 2017/6/24.
 */
public class PizzaApp {
    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        pizza = chicagoStore.orderPizza("cheese");

    }
}
