package myfirstmock;

/**
 * Simple printer.
 * 
 * @author Pieter van den Hombergh {@code p.vandenhombergh@fontys.nl}
 */
public interface Printer {

    void printLn( String print );

    /**
     * Make it deal with objects too.
     * @param o to print.
     */
    default void printLn( Object o ) {
        printLn( o.toString() );
    }
}
