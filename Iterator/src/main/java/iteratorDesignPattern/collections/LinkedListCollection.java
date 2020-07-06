package iteratorDesignPattern.collections;

import iteratorDesignPattern.iterators.BaseIterator;
import iteratorDesignPattern.iterators.LinkedListIterator;


/**
 * LinkedList
 *
 * @author Merve ÖZDEMİR
 * @since 14/06/2020
 */
public class LinkedListCollection extends BaseCollection {
    LinkedList linkedList;

    public LinkedListCollection(LinkedList linkedList) {
        this.linkedList = linkedList;
    }

    public BaseIterator getIterator() {
        return new LinkedListIterator(linkedList.getHead());
    }
}
