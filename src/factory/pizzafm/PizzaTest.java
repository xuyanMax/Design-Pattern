package factory.pizzafm;

/**
 * Created by xu on 2017/6/24.
 */
public class PizzaTest {
     public static void main(String[] args){

         PizzaStore nyStore = new NYPizzaStore();
         PizzaStore chicagoStore = new ChicagoPizzaStore();

         Pizza pizza = nyStore.orderPizza("cheese");



     }
}
