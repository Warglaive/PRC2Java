package pub;

/**
 * @author urs
 */
class Barkeeper {

    private final Pub pub;

    public Barkeeper(Pub pub) {
        this.pub = pub;
    }

    public Beer tapBeer(double amount) {
        return new Beer(amount);
    }

    public void serve(Drinker drinker, Double beerAmount) {
        Beer beer = this.tapBeer(beerAmount);
        drinker.drinkBeer(beer);
    }
}
