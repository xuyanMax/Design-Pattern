package iterator.DinerMergePancake;

import java.util.ArrayList;

/**
 * Created by xu on 14/07/2017.
 */
public class PancakeHouseMenu { //LOU的煎饼屋菜单实现
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
    //随着加入了PancakeMenuIterator后调整代码
    //1、返回迭代器接口，客户不需要知道迭代器是如何维护菜单项的，也不需要知道是如何实现的，只需要直接用迭代器来遍历菜单项即可
    //2、到此，我们将不再需要getMenuItems()方法，这回暴露我们内部的实现
    public Iterator createIterator(){
        return new PancakeMenuIterator(menuItems);
    }
    // 添加其他方法，依赖于数组menuItems[]
}
