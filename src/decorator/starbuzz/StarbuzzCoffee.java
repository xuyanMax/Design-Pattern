package decorator.starbuzz;

import decorator.starbuzz.coffee.Beverage;
import decorator.starbuzz.coffee.DarkRoast;
import decorator.starbuzz.coffee.Espresso;
import decorator.starbuzz.decorator.Mocha;
import decorator.starbuzz.decorator.Whip;

/**
 * Created by xu on 2017/7/4.
 */
public class StarbuzzCoffee {
     public static void main(String[] args){

         // order an espresso with no condiment
         Beverage espresso = new Espresso();
         System.out.println(espresso.getDescription()+" $"+espresso.cost());


         // order a dark roast with double Mocha and a Whip
         Beverage darkRoast = new DarkRoast();
         Whip whip = new Whip(darkRoast);
         Mocha mocha = new Mocha(whip);
         Mocha mocha2 = new Mocha(mocha);

         System.out.println(mocha2.getDescription() + " $" + mocha2.cost());

     }
}
