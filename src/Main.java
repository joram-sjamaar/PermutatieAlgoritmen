import model.RandomPerm;
import model.SwapPerm;
import model.UsedPerm;
import static utils.Numbers.randomArray;

/**
 * Demonstration class for the three algorithms.
 */
public class Main {
    private int[] N = { 5000, 10000, 50000,
            100000, 500000, 1000000, 5000000, 10000000, 50000000, 100000000};

    public static void main(String[] args) {
        new Main().run();
    }


    private void run() {
        doRandomPerm();
        doUsedPerm();
        doSwapPerm();
    }

    private void doRandomPerm(){
        RandomPerm perm  = new RandomPerm();
        for (int i : N) {
            perm.run(i);
            perm = new RandomPerm();
        }
    }
    private void doUsedPerm(){
        UsedPerm perm = new UsedPerm();
        for (int value : N) {
            perm.run(value);
            perm = new UsedPerm();
        }
    }
    private void doSwapPerm(){
        for (int i : N) {
            SwapPerm.run(randomArray(i));
        }
    }




}
