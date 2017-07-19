package composite.menuIterator;

import java.util.Iterator;

/**
 * Created by xu on 15/07/2017.
 */
public class NullIterator implements Iterator {

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
