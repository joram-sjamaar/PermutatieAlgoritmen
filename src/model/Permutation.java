package model;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public abstract class Permutation {

    private int[] N = {
            5000, 10000, 50000, 100000, 500000,
            1000000, 5000000, 10000000, 50000000,
            100000000
    };

//    private int[] N = {
//            100
//    };

    protected abstract void run(int n);

    public void start() {

        // Fill array


        for (int n : N) {

            // TIMERS
            Instant startTime = Instant.now();

            System.out.println("Starting N = " + n);


            this.run(n);

            // stop timer
            Instant endTime = Instant.now();

            System.out.printf("Finished in: %s\n\n", Duration.between(startTime, endTime));
        }

    }

}
