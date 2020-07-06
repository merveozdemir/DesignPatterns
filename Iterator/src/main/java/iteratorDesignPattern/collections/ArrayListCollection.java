package iteratorDesignPattern.collections;

import iteratorDesignPattern.iterators.ArrayListIterator;
import iteratorDesignPattern.iterators.BaseIterator;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * ArrayListCollection
 *
 * @author Merve ÖZDEMİR
 * @since 14/06/2020
 */
public class ArrayListCollection extends BaseCollection {
    ArrayList<Object> arrayList;

    public ArrayListCollection(ArrayList<Object> arrayList) {
        this.arrayList = arrayList;
    }


    public BaseIterator getIterator() {
        return new ArrayListIterator(arrayList);
    }
}
