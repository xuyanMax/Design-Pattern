package iterator.WaitressArrayList;

import iterator.DinerMergeAlternate.Menu;
import iterator.DinerMergeAlternate.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by xu on 15/07/2017.
 */
public class Waitress {
    ArrayList menu;//把所有菜单全部打包进List，然后取得它的迭代器，遍历每一个菜单
                    // 这样一来，女招待的代码就变得很简单，而且菜单再多也不怕了

    public Waitress(ArrayList menu) {
        this.menu = menu;
    }
    public void printMenu(){
        Iterator menuIterator = menu.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }
    }
    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName()+", ");
            System.out.println(menuItem.getPrice()+" - - ");
            System.out.println(menuItem.getDescription());
        }

    }
}
