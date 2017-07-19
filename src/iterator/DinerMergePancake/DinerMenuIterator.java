package iterator.DinerMergePancake;


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

}
