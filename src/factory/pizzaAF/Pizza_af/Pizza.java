package factory.pizzaAF.Pizza_af;

import factory.pizzaAF.Cheese.Cheese;
import factory.pizzaAF.Clam.Clam;
import factory.pizzaAF.Dough.Dough;
import factory.pizzaAF.Pepperoni.Pepperoni;
import factory.pizzaAF.Sauce.Sauce;
import factory.pizzaAF.Veggies.Veggies;

/**
 * Created by xu on 2017/6/24.
 */
public abstract class Pizza {
    private String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies[] veggies;
    public Pepperoni pepperoni;
    public Cheese cheese;
    public Clam clam;
    public abstract void prepare();

    public void bake(){
        System.out.println("Bake 25 min at 350");
    }
    public void cut() {

        if (name.toLowerCase().contains("Chicago"))
            System.out.println("Cutting the pizza into squares slices");
        else
            System.out.println("Cutting the pizza into diagonal slices");

    }
    public void box() {
        System.out.println("Boxing the pizza in an official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if(dough != null)
            builder.append(dough + "\n");
        if (pepperoni != null)
            builder.append(pepperoni + "\n");
        if (cheese != null)
            builder.append(cheese+"\n");
        if (veggies != null) {
            for (int i=0; i<veggies.length; i++) {
                builder.append(veggies[i]);
                if (i!=veggies.length-1)
                    builder.append(", ");
            }
            builder.append("\n");
        }
        if (sauce != null)
            builder.append(sauce + "\n");
        if (clam != null)
            builder.append(clam+"\n");

        return builder.toString();
    }
}
