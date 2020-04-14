package pub;

//@author urs
public class MainSimulation {

    public static void main(String[] args) {
        Beer b = new Beer(DrinkType.SMALL);
        Drinker dr = new Drinker(1);
        dr.drinkBeer(b);
        double r = dr.getVolumeLeft();
    }
}
