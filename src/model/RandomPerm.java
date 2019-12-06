package model;

import utils.Numbers;

public class RandomPerm extends Permutation {

    @Override
    protected void run(int n) {

        int[] numbers = new int[n]; // 1 statement

        for (int i = 0; i < numbers.length; i++) { // 2 statement, 1 checks, N
            numbers[i] = generateNumber(n, numbers); // 1 statement
        }

    }

    private static int generateNumber(int max, int[] array) {
        while (true) { //n
            int number = Numbers.generateRandomNumber(0, max); // 1 statement
            if (!Numbers.inArray(number, array)) { // 1 statement
                return number; // 1 statement
            }
        }
    }

}
