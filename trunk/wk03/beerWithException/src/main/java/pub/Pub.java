package pub;

/**
 * @author Linda Urselmans {@code l.urselmans@fontys.nl}
 */
class Pub {

    //public static final double PINT = 0.57;
    //public static final double SMALL = 0.2;
    private double stock;

    Pub(double beerStock) {
        this.stock = beerStock;
    }

    double getStock() {
        return this.stock;
    }

    void decreaseStock(double amount) throws EmptyStockException {
        if (this.stock - amount >= 0) {
            this.stock -= amount;
        } else {
            throw new EmptyStockException("Stock is empty!");
        }
    }
}
