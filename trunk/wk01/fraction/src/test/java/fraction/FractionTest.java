package fraction;

import static org.assertj.core.api.Assertions.*;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * The test class FractionTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
@TestMethodOrder(OrderAnnotation.class)
public class FractionTest {

    /**
     * Given method as example. Gcd is also given. Break gcd it to make this
     * method turn red.
     */
    @Test
    @Order(0)
    void testGcd() {
        //Make sure the (negative) sign is attached to the numerator.
        assertThat(Fraction.gcd(-12, 4)).isEqualTo(4);
        assertThat(Fraction.gcd(12, -3)).isEqualTo(3);
        assertThat(Fraction.gcd(15, 3)).isEqualTo(3);
        assertThat(Fraction.gcd(-16, 3)).isEqualTo(1);
        //fail( "test testGcd completed successfull, comment me" );
    }

    /**
     * Test of getNum method, of class Fraction. Implicitly tests constructor.
     */
    @Test
    @Order(1)
    void testGetNum() {
        int expectedGetEnumerator = 4;
        assertThat(new Fraction(4, 5).getNumerator()).isEqualTo(expectedGetEnumerator);
    }

    /**
     * Test of getDenom method, of class Fraction.
     */
    @Test
    @Order(2)
    void testGetDenom() {
        int expectedGetDenominator = 5;
        assertThat(new Fraction(4, 5).getDenominator()).isEqualTo(expectedGetDenominator);
    }

    /**
     * Test of negate method, of class Fraction.
     */
    @Test
    @Order(3)
    void testNegate() {
        //No idea how to test this :(.
        int expected = -4;
        assertThat(new Fraction(-4, -5).getNumerator()).isEqualTo(expected);
    }

    @Test
    @Order(4)
    void testTimes() {
        Fraction currentF = new Fraction(2, 2);
        currentF = currentF.times(2, 2);
        Fraction expectedF = new Fraction(4, 4);
        assertThat(currentF).isEqualToComparingFieldByField(expectedF);
    }

    @Test
    @Order(5)
    void testToString() {
        Fraction currentF = new Fraction(2, 2);
        String expectedOutputStr = "(" + currentF.getNumerator() + "/" + currentF.getDenominator() + ")";
        assertThat(currentF.toString()).isEqualTo(expectedOutputStr);
    }

    /**
     * Test the package private {@code Fraction.plus(int a ,int b)} method.
     */
    @Test
    @Order(6)
    void testPlus() {
        //testing if Plus works as intended.
        Fraction curretF = new Fraction(2, 3);
        curretF = curretF.plus(1, 1);
        int expectedN = 3;
        int expectedD = 4;

        Fraction expectedF = new Fraction(expectedN, expectedD);

        assertThat(curretF).isEqualToComparingFieldByField(expectedF);
    }

    /**
     * Test of plus method, of class Fraction. Add to fractions to get a new
     * one.
     */
    @Test
    @Order(7)
    void testPlus_Fraction() {
        //test if a Fraction object is returned(Thanks fontys for the "clear" explenation again"
        Fraction expectedObj = new Fraction(1, 1);
        Fraction plusResult = expectedObj.plus(1, 1);
        assertThat(plusResult).isExactlyInstanceOf(Fraction.class);
    }

    /**
     * Test of minus method, of class Fraction.
     */
    @Test
    @Order(8)
    void testMinus() {
        Fraction curretF = new Fraction(2, 3);
        curretF = curretF.minus(1, 1);
        int expectedN = 1;
        int expectedD = 2;

        Fraction expectedF = new Fraction(expectedN, expectedD);

        assertThat(curretF).isEqualToComparingFieldByField(expectedF);
    }

    @Test
    @Order(9)
    void testDivideBy() {
        Fraction curretF = new Fraction(2, 4);
        curretF = curretF.devideBy(2, 2);
        int expectedN = 1;
        int expectedD = 2;

        Fraction expectedF = new Fraction(expectedN, expectedD);

        assertThat(curretF).isEqualToComparingFieldByField(expectedF);
    }

    /**
     * Test of dividedBy method, of class Fraction.
     */
    @Test
    @Order(10)
    void testDivideBy_Fraction() {
        //test if a Fraction object is returned(Thanks fontys for the "clear" explenation again"
        Fraction expectedObj = new Fraction(1, 1);
        Fraction plusResult = expectedObj.devideBy(1, 1);
        assertThat(plusResult).isExactlyInstanceOf(Fraction.class);
    }

    /**
     * Test of dividedBy(int) method, of class Fraction.
     */
    @Disabled("Think TDD")
    @Test
    @Order(12)
    void testDiv_int() {

        fail("test testDiv_int completed successfully , you can comment me");
    }

    /**
     * Test of plus method, of class Fraction.
     */
    @Disabled("Think TDD")
    @Test
    @Order(13)
    void testPlus_int() {

        fail("test test_Plus_int completed successfully , you can comment me");
    }

    /**
     * Test of flip method, of class Fraction.
     */
    @Disabled("Think TDD")
    @Test
    @Order(14)
    void testFlip() {

        fail("test testFlip completed successfully , you can comment me");
    }

    /**
     * Test of equals method, of class Fraction. Implicitly tests Test helper
     * factory methods frac(int) and frac(int,int).
     *
     * Method given because testing equals typically is a lot of work,
     * repetitive and a-typical for a test because of multiple asserts in one
     * method.
     *
     * Un-comment code below.
     *
     */
    @Disabled("Think TDD")
    @Test
    @Order(3)
    void testEquals() {

        Object obj = null;
        /// Uncomment code below, and test drive the frac(int,int) and frac(int) methods
//        Fraction instance = frac( 1, 2 );
//        assertThat( instance.equals( obj ) ).isFalse();
//
//        
//        obj = new Object();
//        assertThat( instance.equals( obj ) ).isFalse();

//        Fraction f = frac( 3 );
//        assertThat( instance.equals( obj ) ).isFalse();
//
//        f = frac( 3, 2 );
//        assertThat( instance.equals( obj ) ).isFalse();
//
//        f = frac( 3, 6 );
//        assertThat( instance.equals( obj ) ).isTrue();
//
//        f = frac( -1, -2 );
//        assertThat( instance.equals( obj ) ).isTrue();
//        assertThat( instance ).isEqualTo( obj );
    }

    /**
     * Test of hashCode method, of class Fraction.
     */
    @Disabled("Think TDD")
    @Test
    void testHashCode() {

        fail("test testHashCode completed successfully , you can comment me");
    }

    /**
     * Test of compareTo method, of class Fraction.
     */
    @Disabled("Think TDD")
    @Test
    void testCompareTo() {

    }
}
