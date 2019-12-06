import model.RandomPerm;

public class Apl {

    public static void main(String[] args) {
        new Apl().run();
    }

    private void run() {
        RandomPerm randomPerm = new RandomPerm();
        randomPerm.start();
    }

}
