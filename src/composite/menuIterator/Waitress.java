package composite.menuIterator;

import java.util.Iterator;

/**
 * Created by xu on 15/07/2017.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }


    public void printMenu(){
        allMenus.print();
    }

    //使用CompositeIterator
    public void printVegetarian(){
        Iterator iterator = allMenus.createIterator();//得到所有菜单的Composite迭代器
        System.out.println("\nVEGETARIAN MENU\n ----");
        while(iterator.hasNext()) {
            MenuComponent componentMenu = (MenuComponent) iterator.next();
            try {
                if (componentMenu.isVegetarian()) // Menu菜单调用该方法会抛出异常需要用catch接住
                    componentMenu.print();
            }catch (UnsupportedOperationException e) {
                //
            }
        }

    }
}
