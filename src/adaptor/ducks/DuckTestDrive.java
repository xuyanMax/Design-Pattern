package adaptor.ducks;

/**
 * Created by xu on 2017/7/3.
 */
public class DuckTestDrive {
     public static void main(String[] args){
         MallardDuck mallardDuck = new MallardDuck();
         WildTurkey wildTurkey = new WildTurkey();

         Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
         Turkey duckAdapter = new DuckAdapter(mallardDuck);

         System.out.println("Turkey says...");
         wildTurkey.gobble();
         wildTurkey.fly();

         System.out.println("Duck says...");
         mallardDuck.quack();
         mallardDuck.fly();

         System.out.println("TurkeyAdapter says...");
         turkeyAdapter.quack();
         turkeyAdapter.fly();

     }
}
