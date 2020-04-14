
package pub;

/**
 * Well, I am sorry now.
 * @author Linda Urselmans {@code l.urselmans@fontys.nl}
 */
class EmptyStockException extends PubException {

    public EmptyStockException() {
        super( "We are sold out" );
    }

}
