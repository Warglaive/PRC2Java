package pub;

//@author urs
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import static org.assertj.core.api.Assertions.within;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DrinkerTest {

    private Drinker drinker;

    public void setUp() throws Exception {
        Pub pub = new Pub(100.0);
        // drinker = new Drinker(3.0, 18);   
    }

    @Test
    public void drinkerDrinksBeer() throws DrinkerFullException, Exception {
        //boolean didHeDrank = this.drinker.drinkBeer(new Beer(0.57));
        Drinker drinker = new Drinker(5, 20);
        drinker.drinkBeer(new Beer(4));
        double actual = drinker.getVolumeLeft();
        assertThat(actual).isCloseTo(1, within(0.1d));
    }

}
