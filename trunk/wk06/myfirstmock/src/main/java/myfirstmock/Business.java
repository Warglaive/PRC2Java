/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstmock;

/**
 *
 * @author Pieter van den Hombergh {@code p.vandenhombergh@fontys.nl}
 */
public class Business {

    private final Printer printer;

    Business( Printer printer ) {
        this.printer = printer;
    }

    void work() {
        //TODO
        throw new java.lang.UnsupportedOperationException("work() Not supported yet.");

    }

    /**
     * Do some work with input.
     * @param input to work with
     */
    void work( String input ) {
        //TODO trivial hello plus input
        throw new java.lang.UnsupportedOperationException("work() Not supported yet."); 
    }
    
}
