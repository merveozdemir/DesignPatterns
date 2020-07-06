package iteratorDesignPattern.iterators;

import iteratorDesignPattern.collections.BaseCollection;

import java.util.ArrayList;

/**
 * ArrayListIterator
 *
 * @author Merve ÖZDEMİR
 * @since 14/06/2020
 */
public class ArrayListIterator extends BaseIterator {

    private int index;
    ArrayList<Object> arrayListCollection;

    public ArrayListIterator(ArrayList<Object> arrayList) {
        this.arrayListCollection = arrayList;
    }

    public boolean hasNext() {
        if (index >= arrayListCollection.size() || arrayListCollection.get(index) == null){
            return false;
        }
        return true;
    }

    public Object next() {
        Object nextValue = arrayListCollection.get(index);
        index++;
        return nextValue;
    }
}
