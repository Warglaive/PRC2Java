package pub;

//@author urs
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.ThrowableAssert;

public class EmptyStockExceptionTest {

    @Test
    public void shouldThrowEmptyStockException() {
        Pub pub = new Pub( 0.2 );
        Barkeeper barkeeper = new Barkeeper( pub );
        Drinker drinker = new Drinker( 3.0, 18 );
        Beer beer = new Beer( 0.57 );
        ThrowableAssert.ThrowingCallable suspectCode = () -> barkeeper
                .serve( drinker, beer.getSize() );
        assertThatThrownBy( suspectCode )
                .isExactlyInstanceOf( EmptyStockException.class );
    }
}
