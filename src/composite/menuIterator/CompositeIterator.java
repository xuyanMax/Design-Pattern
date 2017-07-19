package composite.menuIterator;


import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by xu on 15/07/2017.
 */
public class CompositeIterator implements Iterator {
    //我们利用迭代器来遍历组件内的每一个项（菜单项或者菜单），
    //我们需要维护组合递归结构的位置，需要栈来维护我们的位置
    LinkedList stack = new LinkedList();

    //将我们需要遍历的项目组合的迭代器传入，抛进一个堆栈结构
    public CompositeIterator(Iterator iterator) {
        this.stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) //如果堆栈空，则表示没有下一个元素
            return false;
        else { //否则，我们从栈顶取出迭代器，查看是否有下一个元素，如果没有，则将它弹出栈顶，然后递归地调用hasNext()
            Iterator iterator = (Iterator) stack.peek();
            if (iterator.hasNext()) {
                return true;
            }
            else {
                stack.pop();
                return hasNext();
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {// 先判断是否有下一个元素，如果有
            Iterator iterator = (Iterator) stack.peek();//取出栈顶的迭代器
            MenuComponent component = (MenuComponent) iterator.next();//然后得到该迭代器的下一个元素
            if (component instanceof Menu) {// Menu NOT MenuItem //如果元素是 "菜单"，我们有了另一个需要被抛进堆栈的组合
                stack.push(component.createIterator());
            }
            return component;//不论是菜单还是菜单项，都返回
        }
        else return null;
    }

    @Override
    public void remove() {//我们不支持删除，只支持遍历
        throw new UnsupportedOperationException();
    }
}
