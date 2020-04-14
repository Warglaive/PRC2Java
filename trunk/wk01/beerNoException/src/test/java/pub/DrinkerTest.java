package pub;

//@author urs
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import static org.assertj.core.api.Assertions.within;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static pub.Pub.PINT;

public class DrinkerTest {

    private Drinker drinker;
    private Pub pub;
    private int drinkerIsFull = 0;

    @BeforeEach
    public void setUp() {
        this.pub = new Pub(100.0);
        drinker = new Drinker(3.0);
    }

    @Test
    public void drinkerDrinksBeer() {
        Beer beer = new Beer(PINT);
        assertThat(this.drinker.drinkBeer(beer)).isTrue();
    }

    @Test
    public void isFull() {
        int beerSize = 3;
        Beer beer = new Beer(beerSize);
        this.drinker.drinkBeer(beer);
        //testing if after having a beer with volume equal to max volume, the drinker will be full.
        assertThat(this.drinker.getVolumeLeft()).isEqualTo(drinkerIsFull);
    }
}
