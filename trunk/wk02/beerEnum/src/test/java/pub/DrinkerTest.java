package pub;

//@author urs
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        Beer beer = new Beer(DrinkType.PINT);
        assertThat(this.drinker.drinkBeer(beer)).isTrue();
    }

    @Test
    public void isFull() {
        this.drinker = new Drinker(1);
        Beer beer = new Beer(DrinkType.LARGE);
        this.drinker.drinkBeer(beer);
        //testing if after having a beer with volume equal to max volume, the drinker will be full.
        assertThat(this.drinker.getVolumeLeft()).isEqualTo(drinkerIsFull);
    }
}
