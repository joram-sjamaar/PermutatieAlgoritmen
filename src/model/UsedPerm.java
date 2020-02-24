package model;

import utils.Numbers;

import static utils.Numbers.inArray;

public class UsedPerm {
    private int[] numbers;
    private boolean[] used;

    public void run(int n ){
        numbers = new int[n];
        used = new boolean[n];

        for (int i = 0; i < numbers.length; i++) { // 2 statement, 1 checks, N
            numbers[i] = generateNumber(n); //  statement
        }
    }

    /**
     * Generates a random number which does not exist in an array.
     * @param max   Highest number to generate
     * @return Random number
     */
    private int generateNumber(int max) {
        while (true) { // n
            int number = Numbers.generateRandomNumber(1, max); //  statement

            if (!used[number-1]) { // check
                used[number-1] = true;
                return number; //  statement
            }
        }
    }

    public int[] getNumbers() {
        return numbers;
    }
}
