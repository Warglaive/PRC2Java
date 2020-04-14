package pub;

/**
 * @author Svetoslav
 */
public class Pub {
    
    public static final double PINT = 0.57;
    public static final double SMALL = 0.2;
    private static final double initialBeerAvailable = 100;
    private double stock;
    private Barkeeper barKeeper;
    private Drinker drinker;
    
    public Pub(double beerStock) {
        this.stock = beerStock;
        this.barKeeper = new Barkeeper(this);
        this.drinker = new Drinker(PINT);
    }
    
    public boolean canDrawBeer(double amount) {
        if (this.stock < amount) {
            return false;
        }
        return true;
    }
}
