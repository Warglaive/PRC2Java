package pub;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import static pub.Pub.PINT;

/**
 * @author urs
 */
public class BarkeeperTest {

    private Barkeeper barkeeper;

    @BeforeEach
    void setUp() {
        Pub pub = new Pub( 100.0 );
        barkeeper = new Barkeeper( pub );
    }

    @Test
    void over_order_returns_null() {
        ThrowingCallable suspectCode = () -> barkeeper.tapBeer( 101.0 );
        assertThatThrownBy( suspectCode )
                .isExactlyInstanceOf( EmptyStockException.class );
    }

    @Test
    void barkeeperTapsBeer() throws EmptyStockException {
        Double expected = PINT;
        Beer actual = barkeeper.tapBeer( expected );
        assertThat( actual.getSize() ).isCloseTo( expected, within( 0.1d ) );
    }

    @Test
    void barkeeperServesDrinker() throws EmptyStockException, DrinkerTooYoungException, DrinkerFullException {
        Drinker drinker = new Drinker( 3.0, 18 );
        double startVolume = drinker.getVolumeLeft();
        barkeeper.serve( drinker, PINT );
        double volumeLeft1 = drinker.getVolumeLeft();
        System.out.println( "volumeLeft1 = " + volumeLeft1 );
        assertThat( volumeLeft1 ).as( "volumeleft did not decrease" )
                .isCloseTo( startVolume - PINT, within( .01 ) );
    }
}
