package tests;

import model.RandomPerm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static model.SwapPerm.*;
import static model.InArray.*;


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

        // invoke swapPerm method on the test array
        swapPerm(testArray);
        for (int i1 : original) {
            System.out.print(i1+" " );
        }
        System.out.println("\n");
        for (int i1 : testArray) {
            System.out.print(i1+" ");
        }
        // check if all original values are in the altered array
        for (int i : original) {
            assertTrue(inArray(i, testArray));
        }


    }

    /**
     * tests if inArray works correctly
     */
    @Test
    void InArrayTest() {
        // array we will test the method on
        int[] testArray = {1, 2, 3, 4, 5};
        // test numbers
        int i = 1, j = 6;
        //should return true
        assertTrue(inArray(i, testArray));
        //should return false
        assertFalse(inArray(j, testArray));
    }
}
