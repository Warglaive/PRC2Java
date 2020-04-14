package pub;

//@author hom
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import org.junit.jupiter.api.Test;

public class BeerSizeTest {
    @Test
    public void testValues() {
        BeerSize[] l = BeerSize.values();
        assertThat( 3 == l.length ).as( "wrong length, should be 2" ).isTrue();
        List<BeerSize> li = new ArrayList();
        li.addAll( Arrays.asList( l ) );
        assertThat( li.contains( BeerSize.PINT ) )
                .as( "PINT should be available" ).isTrue();
        assertThat( li.contains( BeerSize.SMALL ) )
                .as( "SMALL should be available" ).isTrue();
        assertThat( li.contains( BeerSize.LARGE ) )
                .as( "SMALL should be available" ).isTrue();
    }

    @Test
    public void testValueOf() {
        BeerSize s = BeerSize.SMALL;
        BeerSize p = BeerSize.PINT;

        assertThat( BeerSize.valueOf( "SMALL" ) ).as( "Small should be small" )
                .isSameAs( s );
        assertThat( BeerSize.valueOf( "PINT" ) ).as( "Pint should be pint" )
                .isSameAs( p );
    }

    @Test
    public void size_of_pint() {
        assertThat( BeerSize.PINT.getSize() ).as( "size should be 0,57" )
                .isCloseTo( 0.57, within( 0.001 ) );
    }

    @Test
    public void size_of_small() {
        assertThat( BeerSize.SMALL.getSize() ).as( "size should be 0,2" )
                .isCloseTo( 0.2, within( 0.001 ) );
    }

    @Test
    public void size_of_large() {
        assertThat( BeerSize.LARGE.getSize() ).as( "size should be 1.0" )
                .isCloseTo( 1.0, within( 0.001 ) );
    }
}
