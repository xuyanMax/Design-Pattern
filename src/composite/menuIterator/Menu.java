package composite.menuIterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by xu on 15/07/2017.
 */
public class Menu extends MenuComponent {//实现组合菜单
    ArrayList menuComponents = new ArrayList();// 一个菜单可以有任一数目的孩子，这些孩子都应该属于MenuComponent 类
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //菜单和菜单项都是MenuComponent。我们可以只用一个方法把他们加入到菜单中，达到两者兼顾的目的
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    //对于菜单来说，打印菜单名称、描述；再打印菜单包含的所有菜单项的
    //在遍历期间，如果遇到另一个菜单对象，它的print方法会开始另一个遍历，依次类推
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("- - - - - - - -");

        Iterator iterator = menuComponents.iterator();

        while(iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
