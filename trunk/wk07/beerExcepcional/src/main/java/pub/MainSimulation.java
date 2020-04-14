package pub;

/**
 * It is just a simulation mum, they do not teach me to booze there in Venlo.
 *
 * @author Linda Urselmans {@code l.urselmans@fontys.nl}
 */
public class MainSimulation {

    /**
     * Where all programs start, Like the road to Rome, but reversed.
     * @param args not used
     * @throws DrinkerFullException  hope not, it will be messy.
     */
    public static void main( String[] args ) throws DrinkerFullException {
        Pub pub = new Pub( 100.0 );
        Barkeeper barkeeper = new Barkeeper( pub );
        Drinker drinker = new Drinker( 3.0, 18 );
        try {
            barkeeper.serve( drinker, 0.57 );
        } catch ( EmptyStockException | DrinkerTooYoungException ex ) {
            // ignored
        }
    }
}
