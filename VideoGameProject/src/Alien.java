import java.util.Random;

public class Alien {
    private final String NAME;

    private static Random r = new Random(); //initliaized in static area because it's a static variable

    public Alien(String type) {
        this.NAME = type + r.nextInt(100); //new int from 0-99; possible that two have the same name with this method
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return this.NAME;
    }

}
