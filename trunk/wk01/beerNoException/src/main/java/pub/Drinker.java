package pub;

//@author Svetoslav
public class Drinker {

    public double maxVolume;
    private double volumeLeft;

    public Drinker(double maxDrinkVolume) {
        this.maxVolume = maxDrinkVolume;
        this.volumeLeft = this.maxVolume;
    }

    public boolean drinkBeer(Beer beer) {
        if (this.volumeLeft >= beer.size) {
            this.volumeLeft -= beer.size;
            return true;
        }
        return false;
    }

    public double getVolumeLeft() {
        return this.volumeLeft;
    }
}
