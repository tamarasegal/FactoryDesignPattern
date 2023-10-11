public class VideoGame {
    private static final int ALIENGANG = 10;
    public void play() {
        //create an array of 10 aliens and print them
        Alien [] aliens = new Alien[ALIENGANG];
        for (int i = 0; i < 10; i++) {
            aliens[i] = AlienFactory.getAlien();
        }

        for (Alien a : aliens) {
            System.out.println(a);
        }

        //let's run this puppy!
    }
}
