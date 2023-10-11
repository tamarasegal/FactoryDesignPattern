import java.util.Random;
public class AlienFactory { //factory design pattern!!
    private enum Aliens {RatAlien, TigerAlien,MonkeyAlien, SquidAlien};
    static Random r = new Random();
    public static Alien getAlien() {
        Aliens newAlien = Aliens.values()[r.nextInt(Aliens.values().length)];
        switch (newAlien) {
            case RatAlien:
                return new RatAlien();
            case TigerAlien:
                return new TigerAlien();
            case MonkeyAlien:
                return new MonkeyAlien();
            case SquidAlien:
                return new SquidAlien();
            default:
                return null; //no break statemnest because the returns are inherently end the method
        }

    }

}
