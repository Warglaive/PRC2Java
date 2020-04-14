package pub;

/**
 * Size.
 *
 * @author Linda Urselmans {@code l.urselmans@fontys.nl}
 */
public enum BeerSize {
    PINT( 0.57 ), SMALL( 0.2 ), LARGE( 1.0 );

    private final double capacity;

    BeerSize( double size ) {
        capacity = size;
    }

    double getSize() {
        return capacity;
    }

    static BeerSize findBySize( double d ) {
        BeerSize[] values = values();
        for ( BeerSize value : values ) {
            if ( d == value.getSize() ) {
                return value;
            }
        }
        return null;
    }
}
