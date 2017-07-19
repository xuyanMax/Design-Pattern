package composite.menuIterator;

import java.util.Iterator;

/**
 * Created by xu on 15/07/2017.
 */
public abstract class MenuComponent { //菜单组件的抽象类，对每一个方法都提供默认的实现

    //以下三个为"组合"方法，添加、删除和取得某菜单组件
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove (MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    //操作方法，被菜单项所使用
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }
    public void print() {
        throw new UnsupportedOperationException();
    }
    public abstract Iterator createIterator();

}
