package iterator.DinerMergePancake;

import java.util.ArrayList;

/**
 * Created by xu on 14/07/2017.
 */
public class PancakeMenuIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public PancakeMenuIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size())
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        Object obj = items.get(position++);
        return obj;
    }

}
