package template.barista;

import java.util.Scanner;

/**
 * Created by xu on 13/07/2017.
 */
public class CoffeeWithHook extends CoffeeBeverageWithHook{
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public boolean customerWantsCondiments() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Do you want any condiment?(y/n)");
        String yes = kb.next();
        if (yes.toLowerCase().matches("yes|y"))
            return true;
        else
            return false;
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
