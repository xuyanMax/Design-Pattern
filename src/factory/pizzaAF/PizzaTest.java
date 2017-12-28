package factory.pizzaAF;

import factory.pizzaAF.PizzaStore.ChicagoPizzaStore;
import factory.pizzaAF.PizzaStore.NYPizzaStore;
import factory.pizzaAF.PizzaStore.PizzaStore;
import factory.pizzaAF.Pizza_af.Pizza;

/**
 * Created by xu on 2017/6/24.
 */
public class PizzaTest {
     public static void main(String[] args){
         PizzaStore nyStore = new NYPizzaStore();
         Pizza pizza = nyStore.orderPizza("cheese");
         System.out.println(pizza);
         pizza = nyStore.orderPizza("clam");
         System.out.println(pizza);

         pizza = nyStore.orderPizza("pepperoni");
         System.out.println(pizza);

         PizzaStore chicagoStore = new ChicagoPizzaStore();
         pizza = chicagoStore.orderPizza("cheese");

     }

}
