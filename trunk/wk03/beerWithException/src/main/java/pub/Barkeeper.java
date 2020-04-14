package pub;

/**
 * @author Linda Urselmans {@code l.urselmans@fontys.nl}
 */
class Barkeeper {

    private final Pub pub;

    public Barkeeper(Pub pub) {
        this.pub = pub;
    }

    public Beer tapBeer(double amount) throws EmptyStockException {
        //TODO EmptyStock might occur here  
        if (this.pub.getStock() >= amount) {
            this.pub.decreaseStock(amount);
            //Add size and rearange if
            return new Beer(1.0);
        } else {
            throw new EmptyStockException("Stock is empty!");
        }
    }

    public void serve(Drinker drinker, Double beerAmount) {
        //TODO tap Beer but beware of EmptyStock, DrinkerFullException and DrinkerTooYoung!

    }
}
