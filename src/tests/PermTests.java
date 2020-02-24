package tests;

import model.UsedPerm;
import model.RandomPerm;
import model.SwapPerm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static utils.Numbers.inArray;


class PermTests {
    // we'll test every thing 7 times
    private static final int AMOUNT_OF_TIMES = 7;

    /**
     * tests if RandomPerm  works correctly
     */
    @Test
    void RandomPermTest() {
        //instantiate a new randomPerm object
        RandomPerm perm = new RandomPerm();
        //start the permutation
        perm.run(12);
        // get the numbers
        int[] array = perm.getNumbers();

        // assert that all numbers are unique
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                assertNotEquals(array[i], array[j]);
            }
        }

    }

    /**
     * tests if SwapPerm  works correctly
     */
    @Test
    void SwapPermTest() {
        System.out.println("--+ SwapPermTest +--");
        for (int i = 0; i < AMOUNT_OF_TIMES; i++) {
            // original state of array
            int[] original = {1, 2, 3, 4, 5};
            // array that will be altered
            int[] testArray = {1, 2, 3, 4, 5};

            // invoke run method on the test array
            SwapPerm.run(testArray);
            for (int i1 : original) {
                System.out.print(i1+" " );
            }
            System.out.print("| ");
            for (int i1 : testArray) {
                System.out.print(i1+" ");
            }
            // check if all original values are in the altered array
            for (int i1 : original) {
                assertTrue(inArray(i1, testArray));
            }
            System.out.println();


        }
    }

    /**
     * tests if run works correctly
     */
    @Test
    void usedPermTest() {
        System.out.println("--+ UsedPermTest +--");
        for (int i = 0; i < AMOUNT_OF_TIMES; i++) {
            UsedPerm perm = new UsedPerm();
            //start the permutation
            perm.run(12);
            // get the numbers
            int[] array = perm.getNumbers();

            for (int k = 1; k < array.length; k++) {
                for (int j = 0; j < k; j++) {
                    assertNotEquals(array[k], array[j]);
                }
            }
            // for debugging:
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j]+" ");
            }
            System.out.println();
        }
    }
}
