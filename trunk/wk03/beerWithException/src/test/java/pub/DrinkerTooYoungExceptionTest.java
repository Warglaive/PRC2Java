package pub;

//@author urs
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import org.junit.jupiter.api.Test;

public class DrinkerTooYoungExceptionTest {
    @Test
    public void DrinkerTooYoungExceptionTest() {
        assertThatExceptionOfType(DrinkerTooYoungException.class).isThrownBy(() -> {
            new Drinker(1, 2);
        }).withMessage("young ass alchoholic");
    }
}
