package pub;

/**
 * @author Linda Urselmans {@code l.urselmans@fontys.nl}
 */
public enum BeerSize {
    SMALL(0.2), PINT(0.57), LARGE(1.0);

    private double size;

    private BeerSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }
}
