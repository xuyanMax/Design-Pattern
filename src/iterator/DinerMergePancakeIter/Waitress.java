package iterator.DinerMergePancakeIter;

import java.util.Iterator;

/**
 * Created by xu on 14/07/2017.
 */
public class Waitress {

    //Menu
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    //在构造器中，女招待照顾两个菜单 Menu
    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
    // 这个printMenu()为 每一个菜单创建一个迭代器
    public void printMenu(){
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        Iterator pancakeMenuIterator = pancakeHouseMenu.createIterator();

        System.out.println("Menu\n- - - - -");
        System.out.println("Breakfast");
        printMenu(pancakeMenuIterator);

        System.out.println("Menu\n- - - - -");
        System.out.println("Breakfast");
        printMenu(dinerMenuIterator);


    }
    //这个重载的方法，使用迭代器，来遍历菜单项并打印出来
    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem next = (MenuItem) iterator.next();
            System.out.print(next.getName()+", ");
            System.out.print(next.getDescription() + ", ");
            System.out.println(next.getPrice()+", ");
        }

    }
}
