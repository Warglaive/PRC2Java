package nl.fontys.sebivenlo.library;

import java.util.Collection;

/**
 * Search strategy interface which can be used to apply searches with some extra
 * operations.
 *
 * A functional interface can be part of a lambda expression.
 *
 * @author Jan Trienes
 * @param <T> The type of items to be searched for
 */
@FunctionalInterface
public interface SearchStrategy<T> {

    /**
     * Applies the search and returns the matching items.
     *
     * @return collection holding the matching items
     */
    Collection<T> applySearch();
}
