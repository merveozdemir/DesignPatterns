package iteratorDesignPattern.collections;

import iteratorDesignPattern.iterators.BaseIterator;

/**
 * BaseCollection
 *
 * @author Merve ÖZDEMİR
 * @since 14/06/2020
 */
public abstract class BaseCollection {

    public abstract BaseIterator getIterator();

}
