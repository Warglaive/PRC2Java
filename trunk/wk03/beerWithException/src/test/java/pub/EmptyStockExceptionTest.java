package pub;

//@author urs
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import org.junit.jupiter.api.Test;
import pub.*;

public class EmptyStockExceptionTest {

    private Pub pub;

    @Test
    public void pubStockEmptyTest() {
        this.pub = new Pub(20);
        assertThatExceptionOfType(EmptyStockException.class).isThrownBy(() -> {
            this.pub.decreaseStock(30);
        }).withMessage("Stock is empty!");
    }
}
