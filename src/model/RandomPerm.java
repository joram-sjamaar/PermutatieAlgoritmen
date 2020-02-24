package model;

import utils.Numbers;


public class RandomPerm extends Permutation {
    private int[] numbers;

    /**
     * Generates an array with random numbers. Without duplicates
     *
     * @param n amount to run with
     */
    @Override
    public void run(int n) {
        numbers = new int[n]; // 1 statement

        for (int i = 0; i < numbers.length; i++) { // 2 statement, 1 checks, N
            numbers[i] = generateNumber(n, numbers); // 1 statement
        }

    }

    /**
     * Generates a random number which does not exist in an array.
     * @param max   Highest number to generate
     * @param array Array to check if the number already exists
     * @return Random number
     */
    private static int generateNumber(int max, int[] array) {
        while (true) { //n
            int number = Numbers.generateRandomNumber(0, max); // 1 statement
            if (!UsedPerm.run(number, array)) { // n
                return number; // 1 statement
            }
        }
    }

    public int[] getNumbers() {
        return numbers;
    }
}
