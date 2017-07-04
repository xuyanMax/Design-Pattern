package singleton.Chocolate;

/**
 * Created by xu on 2017/6/28.
 */
public class ChocolateController {
     public static void main(String[] args){
         ChocolateBoiler boiler = ChocolateBoiler.getInstance();
         boiler.fill();
         boiler.boil();
         boiler.drain();

        // will return the existing instance
         ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
         System.out.println(boiler == boiler2);// true
     }

}
