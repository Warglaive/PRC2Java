package pub;

//@author Svetoslav
public class Drinker {

    private double maxVolume;
    private double volumeLeft;

    public Drinker(double maxDrinkVolume) {
        this.maxVolume = maxDrinkVolume;
        this.volumeLeft = this.maxVolume;
    }

    public boolean drinkBeer(Beer beer) {
        if (this.volumeLeft >= beer.getSize()) {
            this.volumeLeft -= beer.getSize();
            return true;
        } else {
            return false;
        }
    }

    public double getVolumeLeft() {
        return this.volumeLeft;
    }
}
