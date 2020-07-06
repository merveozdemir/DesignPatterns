package iteratorDesignPattern.iterators;

import iteratorDesignPattern.collections.BaseCollection;

/**
 * ArrayIterator
 *
 * @author Merve ÖZDEMİR
 * @since 14/06/2020
 */
public class ArrayIterator extends BaseIterator {

    private int index;
    Object [] arrayCollection;

    public ArrayIterator(Object[] arrayCollection) {
        this.arrayCollection = arrayCollection;
    }

    public boolean hasNext() {
        if (index >= arrayCollection.length || arrayCollection[index] == null){
            return false;
        }
        return true;
    }

    public Object next() {
        Object nextValue = arrayCollection[index];
        index++;
        return nextValue;
    }
}
