package model;

import java.time.Duration;
import java.time.Instant;

public abstract class Permutation {

    /**
     * The different N numbers to test.
     */
    private int[] N = {
            5000, 10000, 50000, 100000, 500000,
            1000000, 5000000, 10000000, 50000000,
            100000000
    };

    /**
     * Run the permutation
     *
     * @param n amount to run with
     */
    protected abstract void run(int n);

    /**
     * Tests each N value. Measures it ten times and takes an average.
     * Neatly displays the results in System output
     */
    public void start() {

        for (int n : N) {

            /**
             * Stores the measurements of N
             */
            long[] results = new long[10];

            // He's making an array, and he's checking it TEN times!!
            // Gonna find out who's measuring it nice.
            // Permutation is coming.. to TOWN!!
            for (int i = 0; i < 10; i++) {

                System.out.printf("(#%d of 10) Creating %d numbers.", i+1, n);

                // Starting time
                Instant startTime = Instant.now();

                // Run the creating algorithm
                this.run(n);

                // End time
                Instant endTime = Instant.now();

                // Results is the duration between the starting time and end time.
                long result = Duration.between(startTime, endTime).toMillis();

                // Store results for analytic use later.
                results[i] = result;
                System.out.printf(".. %d milliseconds\n", result);

            }

            /**
             * This will contain all the results combined so it later can be divided to take an average.
             */
            long result_sum = 0;

            // Display results.
            System.out.println("+--------------+----------------------------+");
            System.out.println("|      ID      |           Result           |");
            System.out.println("+--------------+----------------------------+");
            for (int i = 0; i < 10; i++) {
                result_sum += results[i];
                System.out.printf("| #%d           | %d milliseconds |\n", i+1, results[i]);
            }
            System.out.printf("| Average       | %d milliseconds |\n", result_sum/10);
            System.out.println("+--------------+----------------------------+");

        }

    }

}
