package template.barista;

/**
 * Created by xu on 13/07/2017.
 */
public class BeverageHookTestDrive {
     public static void main(String[] args){
         TeaWithHook tea = new TeaWithHook();
         CoffeeWithHook coffee = new CoffeeWithHook();
         System.out.println("- - - - - Making tea - - - - -");
         tea.prepareRecipe();
         System.out.println("- - - - - Making coffee - - - - -");

         coffee.prepareRecipe();

     }
}
