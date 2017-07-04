package adaptor.ducks;

/**
 * Created by xu on 2017/7/3.
 */
public class TurkeyTestDrive {
     public static void main(String[] args){
         MallardDuck duck = new MallardDuck();
         Turkey duckAdapter = new DuckAdapter(duck); // 将鸭子包装仅一个火鸡适配器中，使其看起来像火鸡

         System.out.println("DuckAdapter says...");
         for (int i=0; i<10; i++) {
             duckAdapter.gobble();
             duckAdapter.fly();
         }
     }
}
