package pub;

//@author urs
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pub.Beer;
import pub.Drinker;

class DrinkerFullExceptionTest {

    private Drinker drinker;
    private double startCapacity = 10;
    private int age = 20;

    @Test
    public void DrinkerFullExceptionTest() throws DrinkerFullException, Exception {
        this.drinker = new Drinker(this.startCapacity, this.age);
        assertThatExceptionOfType(DrinkerFullException.class).isThrownBy(() -> {
            this.drinker.drinkBeer(new Beer(90));
        }).withMessage("Drinker is full!");
    }

}
