package fraction;

/**
 * Immutable Fraction : numerator/denominator. Fraction parts are constant after
 * construction. Immutable also means thread safety. Invariants: Fraction is
 * always normalised (greatest common divisor of denominator and numerator is
 * 1). Denominator is greater or equal to 1.
 *
 * @author Pieter van den Hombergh
 */
public class Fraction implements Comparable<Fraction> {
    //TODO Implement Fields, constructor and methods

    /**
     * Compute Greatest Common Divisor. Used to normalize fractions.
     *
     * @param a first number
     * @param b second number
     * @return greatest common divisor.
     */
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator) {
        this.numerator = numerator;
        //hard coded value because of requirements.
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        //Do NOT test it.
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator should be > 0");
        }
        normaliseResultFaction(numerator, denominator);
        this.numerator = numerator;
        this.denominator = denominator;
        gcd(numerator, denominator);
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public static int gcd(int a, int b) {
        // make sure params to computation are positive.
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public int normaliseResultFaction(int a, int b) {
        return a / b;
    }

    /**
     * Compare this fraction with other.
     *
     * @param other fraction
     * @return 0 if fractions are equal, 1 if this greater then other or -1 if
     * other greater then this.
     */
    @Override
    public int compareTo(Fraction other) {
        // implement compareto
        return 0;
    }

    public Fraction times(int otherN, int otherD) {
        int newNumerator = this.numerator * otherN;
        int newDenominator = this.denominator * otherD;
        return new Fraction(newNumerator, newDenominator);
    }

    public Integer times(Fraction other) {
        return this.times(other);   
    }

    public Fraction plus(int otherN, int otherD) {
        return new Fraction(numerator + otherN, denominator + otherD);
    }

    public Fraction plus(Fraction other) {
        return this.plus(other);
    }

    public Fraction minus(int otherN, int otherD) {
        return new Fraction(this.numerator - otherN, this.denominator - otherD);
    }

    public Fraction minus(Fraction other) {
        return this.minus(other);
    }

    public Fraction devideBy(int otherN, int otherD) {
        return new Fraction(this.numerator / otherN, this.denominator / otherD);
    }

    public Fraction devideBy(Fraction other) {
        return this.minus(other);
    }

    @Override
    public String toString() {
        return "(" + this.numerator + "/" + this.denominator + ")";
    }
}
