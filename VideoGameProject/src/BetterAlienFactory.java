import java.util.Random;

public class BetterAlienFactory { //don;t have to update the switch statement after changing alien enum
    private enum Aliens {RatAlien, TigerAlien,MonkeyAlien, SquidAlien};
    static Random r = new Random();
    public static Alien getAlien() { //bad bc you have to update the switch statement after changing the alien enum
        Aliens newAlien = Aliens.values()[r.nextInt(Aliens.values().length)];
        Alien alien = null;
        try { //this code is a little on the nasty side
            alien = (Alien)(Class.forName(newAlien.toString()).getDeclaredConstructor().newInstance());
        }
        catch (Exception e) {
            System.out.println("Unknown Alien Type");

        }
        return alien;
    }
}
