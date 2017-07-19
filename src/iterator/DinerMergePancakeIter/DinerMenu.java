package iterator.DinerMergePancakeIter;

import java.util.Iterator;

/**
 * Created by xu on 14/07/2017.
 */
public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6; //可以控制菜单长度
    int numOfItems = 0;
    MenuItem[] menuItems; // MEL使用数组，可以控制菜单的长度，并且在取出菜单项的时候，不需要转型

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        //与LOU一样采用addItem辅助方法在构造器中创建菜单项
        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole meat",
                true,2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole meat",
                false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad",
                false, 3.29);
        addItem("Hotdog", "A hot dog, with saukraut, relish, onions, topped with cheese",
                false, 3.05);
        //继续添加其他菜单项


    }
    //首先会检查数组是否已经超出长度限制，并需要所有必要参数来创建一个菜单项
    public void addItem(String name, String description, boolean vegetarian, double price){
        if (numOfItems<MAX_ITEMS)
            menuItems[numOfItems++] = new MenuItem(name, description, price, vegetarian);
        else
            System.out.println("Sorry, menu is full! Cannot add item anymore");
    }

    //返回一个菜单项的数组
    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    //数组没有iterator()方法因此保留DinerMenuIterator
    @Override
    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }


    // 添加其他方法，依赖于数组menuItems[]

}
