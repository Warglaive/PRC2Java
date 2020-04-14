package pub;

/**
 * @author urs
 */
class Barkeeper {

    private final Pub pub;

    public Barkeeper(Pub pub) {
        this.pub = pub;
    }

    public Beer tapBeer(DrinkType type) {
        return new Beer(type);
    }

    public void serve(Drinker drinker, DrinkType type) {
        Beer beer = this.tapBeer(type);
        drinker.drinkBeer(beer);
    }
}
