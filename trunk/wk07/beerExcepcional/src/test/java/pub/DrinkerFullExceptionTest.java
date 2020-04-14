package pub;

//@author urs
import static org.assertj.core.api.Assertions.*;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.Test;

class DrinkerFullExceptionTest {

    @Test
    public void shouldThrowDrinkerFullException() {
        Drinker drinker = new Drinker( 0.2, 18 );
        Beer beer = new Beer( 0.57 );
        ThrowingCallable suspectCode = () -> drinker.drinkBeer( beer );
        assertThatThrownBy( suspectCode )
                .isExactlyInstanceOf( DrinkerFullException.class );
    }
}
