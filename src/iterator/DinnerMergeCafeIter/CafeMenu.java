package iterator.DinnerMergeCafeIter;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by xu on 14/07/2017.
 */
public class CafeMenu implements Menu {
    //菜单项用散列表存储
    HashMap menuItems = new HashMap();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries",
                "Veggie Burger on a whole wheat bun, lettuce, tomato, and fries",
                true,
                3.99
                );
        addItem("Soup of the day",
                "A cup of a soup of the day, with a side salad",
                false,
                3.69
        );
        addItem("Burrito",
                "A large Burrito, with whole pinto beans, salsa, guacamole",
                true,
                4.29
        );

    }
    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem item = new MenuItem(name, description, price, vegetarian);
        menuItems.put(item.getName(), item);
    }


    //这里不是取整个hashmap，而是取得值的部分的迭代器
    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
