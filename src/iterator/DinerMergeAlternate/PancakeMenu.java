package iterator.DinerMergeAlternate;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by xu on 14/07/2017.
 */
public class PancakeMenu implements Menu {
    ArrayList menuItems;

    public PancakeMenu() {
        menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries, and blueberry syrup",
                true,
                3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, price, vegetarian);
        menuItems.add(menuItem);
    }


    public Iterator createIterator() {
        return menuItems.iterator();
    }

    // other menu methods here
}
