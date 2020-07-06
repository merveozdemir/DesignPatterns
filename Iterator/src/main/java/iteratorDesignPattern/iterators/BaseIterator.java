package iteratorDesignPattern.iterators;

import iteratorDesignPattern.collections.BaseCollection;

import java.util.Collection;

/**
 * BaseIterator
 *
 * @author Merve ÖZDEMİR
 * @since 14/06/2020
 */
public abstract class BaseIterator {

    public abstract boolean hasNext();
    public abstract Object next();

}
