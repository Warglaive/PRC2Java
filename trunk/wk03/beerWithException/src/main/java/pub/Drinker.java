package pub;

/**
 * @author Linda Urselmans {@code l.urselmans@fontys.nl}
 */
class Drinker {

    private double startCapacity;
    //TODO age variable

    private int age;

    Drinker(double maxDrinkVolume, int anAge) throws Exception {
        //if age < 18 -> Throw exception
        this.age = anAge;
        if (this.age < 18) {
            throw new DrinkerTooYoungException("young ass alchoholic");
        }
        this.startCapacity = maxDrinkVolume;
    }

    boolean drinkBeer(Beer beer) throws DrinkerFullException {
        //TODO Drink beer, but raise exception if drinker is full
        if (this.startCapacity - beer.getSize() >= 0) {
            this.startCapacity -= beer.getSize();
            return true;
        } else {
            throw new DrinkerFullException("Drinker is full!");
        }
    }

    double getVolumeLeft() {
        return startCapacity;
    }

    public int getAge() {
        return this.age;
    }
}
