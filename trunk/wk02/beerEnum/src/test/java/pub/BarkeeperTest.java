package pub;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

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
        double maxDrinkVolume = 20;
        Pub pub = new Pub(initialBeerAvailable);
        assertThat(initialBeerAvailable == 100).isTrue();
        assertThat(this.barkeeper = new Barkeeper(pub)).isEqualTo(barkeeper);
        assertThat(this.drinker = new Drinker(maxDrinkVolume)).isEqualTo(drinker);
    }
//    @Test
//    public void over_order_returns_null() {
//        this.barkeeper.serve(drinker, PINT);
//        this.barkeeper.tapBeer(PINT);
//        assertThat(this.barkeeper.serve(null, null)).isNull();
//    }

    @Test
    public void barkeeperTapsBeer() {
        this.beer = this.barkeeper.tapBeer(DrinkType.PINT);
        double expectedResult = 0.57;
        //assertThat(beer).isEqualTo(beer);
        //beer size test
        assertThat(beer.getSize()).isEqualTo(expectedResult);
    }

    @Test
    public void barkeeperServesDrinker() {
        //Not sure how to test a void method.
        this.barkeeper.serve(drinker, DrinkType.LARGE);
        //different test. - not connected to the privious line of code.
        this.beer = new Beer(DrinkType.PINT);
        assertThat(drinker.drinkBeer(beer)).isTrue();
    }
}
