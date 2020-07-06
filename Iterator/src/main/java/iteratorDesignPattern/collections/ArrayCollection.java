package iteratorDesignPattern.collections;

import iteratorDesignPattern.iterators.ArrayIterator;
import iteratorDesignPattern.iterators.BaseIterator;

/**
 * ArrayCollection
 *
 * @author Merve ÖZDEMİR
 * @since 14/06/2020
 */
public class ArrayCollection extends BaseCollection{
    Object [] array;

    public ArrayCollection(Object [] array) {
        this.array = array;
    }


    public BaseIterator getIterator() {
        return new ArrayIterator(array);
    }

}
