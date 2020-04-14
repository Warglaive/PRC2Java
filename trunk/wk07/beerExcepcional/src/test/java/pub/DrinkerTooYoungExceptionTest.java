package pub;

//@author urs
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

public class DrinkerTooYoungExceptionTest {
    
    @Test
    public void shouldThrowDrinkerTooYoungException() {
        Pub pub = new Pub( 100.0 );
        Barkeeper barkeeper = new Barkeeper( pub );
        Drinker drinker = new Drinker( 0.2, 15 );
        Beer beer = new Beer( 0.57 );
        ThrowableAssert.ThrowingCallable suspectCode = () -> barkeeper
                .serve( drinker, beer.getSize() );
        assertThatThrownBy( suspectCode )
                .isExactlyInstanceOf( DrinkerTooYoungException.class );
    }
}
