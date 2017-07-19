package iterator.DinerMergePancake;

import iterator.DinerMergePancake.*;

/**
 * Created by xu on 14/07/2017.
 */
public class Waitress {
    //将迭代器整合进来
    //1、创建一个printMenu()方法，传入一个迭代器当作参数
    //2、对每一个菜单使用createIterator()方法来检索迭代器，并将迭代器传入新的方法

    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    //在构造器中，女招待照顾两个菜单
    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
    // 这个printMenu()为 每一个菜单创建一个迭代器
    public void printMenu(){
        DinerMenuIterator dinerMenuIterator = (DinerMenuIterator) dinerMenu.createIterator();
        PancakeMenuIterator pancakeMenuIterator = (PancakeMenuIterator) pancakeHouseMenu.createIterator();

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
