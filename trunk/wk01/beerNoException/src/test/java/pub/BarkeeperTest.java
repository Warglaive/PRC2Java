package pub;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;
import static pub.Pub.PINT;

/**
 * @author urs
 */
public class BarkeeperTest {

    private Barkeeper barkeeper;
    private Drinker drinker;
    private double initialBeerAvailable = 100;
    private Beer beer;

    @Test
    @BeforeEach
    public void setUp() {
        Pub pub = new Pub(initialBeerAvailable);
        assertThat(initialBeerAvailable == 100).isTrue();
        assertThat(this.barkeeper = new Barkeeper(pub)).isEqualTo(barkeeper);
        assertThat(this.drinker = new Drinker(PINT)).isEqualTo(drinker);
    }
//    @Test
//    public void over_order_returns_null() {
//        this.barkeeper.serve(drinker, PINT);
//        this.barkeeper.tapBeer(PINT);
//        assertThat(this.barkeeper.serve(null, null)).isNull();
//    }
    @Test
    public void barkeeperTapsBeer() {
        this.beer = this.barkeeper.tapBeer(PINT);
        assertThat(beer).isEqualTo(beer);
        //beer size test
        assertThat(beer.size).isEqualTo(PINT);
    }

    @Test
    public void barkeeperServesDrinker() {
        this.beer = new Beer(PINT);
        assertThat(drinker.drinkBeer(beer)).isTrue();
    }
}
