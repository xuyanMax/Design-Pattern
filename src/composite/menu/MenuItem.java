package composite.menu;

import iterator.DinerMergePancake.Iterator;

/**
 * Created by xu on 15/07/2017.
 */
public class MenuItem extends MenuComponent {//实现菜单项
    String name;
    String description;
    double price;
    boolean vegetarian;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    //对于菜单项，打印名称、价格、描述、是否为素食
    @Override
    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian())
            System.out.print("(v)");

        System.out.println(", " + getPrice());
        System.out.println("    - -" + getDescription());
    }

}
