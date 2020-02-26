import model.RandomPerm;
import model.SwapPerm;
import model.UsedPerm;

import java.time.Duration;
import java.time.Instant;

import static utils.Numbers.randomArray;

/**
 * Demonstration class for the three algorithms.
 */
public class Main {
    Instant start, end;

    private int[] N = { 5000, 10000, 50000,
            100000, 500000, 1000000, 5000000, 10000000, 50000000, 100000000};

    public static void main(String[] args) {
        new Main().run();
    }


    private void run() {
//        doRandomPerm();
//        doUsedPerm();
        doSwapPerm();
    }

    private void doRandomPerm(){
        System.out.println("Starting random perm algorithm: ");
        RandomPerm perm  = new RandomPerm();
        for (int i : N) {
            start = Instant.now();
            perm.run(i);
            end = Instant.now();

            System.out.println("       --Sorted "+i+" numbers in "+ Duration.between(start,end));

            perm = new RandomPerm();
        }
        System.out.println();
    }
    private void doUsedPerm(){
        System.out.println("Starting used perm algorithm: ");
        UsedPerm perm = new UsedPerm();
        for (int i : N) {
            start = Instant.now();
            perm.run(i);
            end = Instant.now();

            System.out.println("       --Sorted "+i+" numbers in "+ Duration.between(start,end));

            perm = new UsedPerm();
        }
        System.out.println();
    }
    private void doSwapPerm(){
        System.out.println("Starting swap perm algorithm: ");
        SwapPerm perm = new SwapPerm();
        for (int i : N) {
            start = Instant.now();
            perm.run(randomArray(i));
            end = Instant.now();

            System.out.println("       --Sorted "+i+" numbers in "+ Duration.between(start,end));

            perm = new SwapPerm();
        }
        System.out.println();
    }




}
