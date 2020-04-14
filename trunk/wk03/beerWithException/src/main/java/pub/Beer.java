package pub;

/**
 * @author Linda Urselmans {@code l.urselmans@fontys.nl}
 */
public class Beer {
    //SMALL (0.2L), LARGE (1.0L) or PINT (0.57L)

    private final double capacity;

    public Beer(double size) {
        capacity = size;
    }

    public double getSize() {
        return capacity;
    }
}
