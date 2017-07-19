package template.barista;

import java.util.Scanner;

/**
 * Created by xu on 13/07/2017.
 */
public class TeaWithHook extends CoffeeBeverageWithHook {
    @Override
    void brew() {
        System.err.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.err.println("Adding lemon");
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
}
