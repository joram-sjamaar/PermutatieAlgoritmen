package tests;

import model.InArray;
import model.RandomPerm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static model.SwapPerm.*;


class PermTests {

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
        // original state of array
        int[] original = {1, 2, 3, 4, 5};
        // array that will be altered
        int[] testArray = {1, 2, 3, 4, 5};

        // invoke run method on the test array
        run(testArray);
        for (int i1 : original) {
            System.out.print(i1+" " );
        }
        System.out.println("\n");
        for (int i1 : testArray) {
            System.out.print(i1+" ");
        }
        // check if all original values are in the altered array
        for (int i : original) {
            assertTrue(InArray.run(i, testArray));
        }


    }

    /**
     * tests if run works correctly
     */
    @Test
    void InArrayTest() {
        // array we will test the method on
        int[] testArray = {1, 2, 3, 4, 5};
        // test numbers
        int i = 1, j = 6;
        //should return true
        assertTrue(InArray.run(i, testArray));
        //should return false
        assertFalse(InArray.run(j, testArray));
    }
}
