package template.barista;

/**
 * Created by xu on 13/07/2017.
 */
public abstract class CoffeeBeverageWithHook {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments())
            addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();
    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void pourInCup(){
        System.out.println("Pouring into cup");
    }
    public boolean customerWantsCondiments() {
        return true;
    }
}
