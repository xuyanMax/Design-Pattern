package template.barista;

/**
 * Created by xu on 13/07/2017.
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("- - - - - Making tea - - - - -");
        tea.prepareRecipe();
        System.err.println("");
        System.out.println("- - - - - Making coffee - - - - -");

        coffee.prepareRecipe();

    }
}
