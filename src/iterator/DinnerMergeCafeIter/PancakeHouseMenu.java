package iterator.DinnerMergeCafeIter;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by xu on 14/07/2017.
 */
public class PancakeHouseMenu implements Menu { //LOU的煎饼屋菜单实现
    ArrayList menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast",
                true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs and toast",
                false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes with fresh blueberries",
                true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries",
                true, 3.59);



    }
    //要加入一个菜单项：创建一个新的菜单项对象，然后将它加入到ArrayList中
    public void addItem(String name, String description, boolean vegetarian, double price){
        menuItems.add(new MenuItem(name, description, price, vegetarian));
    }

    //返回一个菜单项的数组
    public ArrayList getMenuItems() {
        return menuItems;
    }

    //不再创建自己的迭代器，而是调用菜单项
    @Override
    public Iterator createIterator(){
        return menuItems.iterator();
    }
    // 添加其他方法，依赖于数组menuItems[]
}
