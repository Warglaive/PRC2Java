package pub;

/**
 * @author urs
 */
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import static pub.Pub.PINT;

public class PubTest {

    private Pub pub;
    private final int initialBeerStock = 0;

    @Test
    public void stockEmptyNoBeer() {
        int beerAmount = 1;
        this.pub = new Pub(initialBeerStock);
        //test if the stock is empty.
        assertThat(this.pub.canDrawBeer(beerAmount)).isFalse();
    }

    @Test //or barkeeper serves
    public void drinkerOrdersBeer() {
        Drinker drinker = new Drinker(3.0);
        Beer beer = new Beer(PINT);
        assertThat(drinker.drinkBeer(beer)).isTrue();
    }
}
