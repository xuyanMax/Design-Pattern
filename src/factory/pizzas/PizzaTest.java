package factory.pizzas;

/**
 * Created by xu on 2017/6/24.
 */
public class PizzaTest {
     public static void main(String[] args){
         SimplePizzaFactory factory = new SimplePizzaFactory();
         String type = "CheesePizza";
         PizzaStore store = new PizzaStore(factory);
         Pizza pizza = store.orderPizza(type);


         System.out.println(pizza);

     }
}
