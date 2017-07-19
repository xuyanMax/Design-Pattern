package iterator.DinnerMergeCafeIter;


import java.util.Iterator;

/**
 * Created by xu on 14/07/2017.
 */
public class Waitress {
    Menu cafeMenu;
    Menu pancakeMenu;
    Menu DinerMenu;

    public Waitress(Menu cafeMenu, Menu pancakeMenu, Menu dinerMenu) {
        this.cafeMenu = cafeMenu;
        this.pancakeMenu = pancakeMenu;
        DinerMenu = dinerMenu;
    }
    public void printMenu(){
        Iterator iteratorDiner = cafeMenu.createIterator();
        Iterator iteratorPancake = pancakeMenu.createIterator();
        Iterator iteratorCafe = cafeMenu.createIterator();

        System.out.println("Menu\n- - - - -");
        System.out.println("Breakfast");
        printMenu(iteratorPancake);

        System.out.println("Menu\n- - - - -");
        System.out.println("Dinner");
        printMenu(iteratorDiner);

        System.out.println("Menu\n- - - - -");
        System.out.println("Cafe");
        printMenu(iteratorCafe);

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
