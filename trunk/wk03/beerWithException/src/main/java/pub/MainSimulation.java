package pub;

/**
 * @author Linda Urselmans {@code l.urselmans@fontys.nl}
 */
public class MainSimulation {

    public static void main(String[] args) throws Exception {
        Drinker drinker = new Drinker(2.43, 20);
        drinker.drinkBeer(new Beer(2.42));
        double actual = drinker.getVolumeLeft();
    }
}
