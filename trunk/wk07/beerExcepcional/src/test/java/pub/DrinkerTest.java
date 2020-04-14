package pub;

//@author urs
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DrinkerTest {

    private Drinker drinker;

    @BeforeEach
    public void setUp() {
        Pub pub = new Pub( 100.0 );
        drinker = new Drinker( 3.0, 18 );

    }

    @Test
    public void drinkerDrinksBeer() throws DrinkerFullException {

        drinker.drinkBeer( new Beer( 0.57 ) );
        double actual = drinker.getVolumeLeft();
        assertThat( actual ).isCloseTo( 2.43, within( 0.1d ) );
    }

}
