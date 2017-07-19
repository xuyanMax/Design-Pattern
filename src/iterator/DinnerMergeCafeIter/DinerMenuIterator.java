package iterator.DinnerMergeCafeIter;

import java.util.Iterator;

/**
 * Created by xu on 14/07/2017.
 */
public class DinerMenuIterator implements Iterator {//实现具体的迭代器
    MenuItem[] items;
    int position = 0;//记录当前数组遍历位置

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }


    @Override
    public boolean hasNext() {
        // 检查是否已经取得数组内所有的元素 || 因为使用的是固定长度的数组，因此还需要检查是否下一项是null，如果是null，则表示没有下一项
        if (position >= items.length || items[position] == null)
            return false;
        else
            return true;
    }


    @Override
    public Object next() {
        MenuItem menuItem = items[position++];

        return menuItem;
    }

    //重写remove方法，因为使用的是固定长度的数组，所以在remove()被调用时，我们将后面的元素向前移动
    @Override
    public void remove() {
        if (position <= 0)
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        if (items[position - 1]!=null) { // position 指向新位置 position-1指向被删除的元素
            for (int i=position-1; i<items.length-1; i++){
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }
}
