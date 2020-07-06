package iteratorDesignPattern.iterators;


import iteratorDesignPattern.collections.Node;

import java.util.LinkedList;

/**
 * LinkedListIterator
 *
 * @author Merve ÖZDEMİR
 * @since 14/06/2020
 */
public class LinkedListIterator extends BaseIterator {

    Node currentNode;

    public LinkedListIterator(Node headerNode) {
        this.currentNode = headerNode;
    }

    public boolean hasNext() {
        if (currentNode == null){
            return false;
        }
        return true;
    }

    public Object next() {
        Object nextValue = currentNode.getData();
        currentNode = currentNode.getNextNode();
        return nextValue;
    }
}
