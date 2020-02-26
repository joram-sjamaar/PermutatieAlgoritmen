package model;

import java.util.Random;

public class SwapPerm {
    public void run(int[] array) {
        int temp, index;

        for (int i = 1; i < array.length; i++) {  // n
            //pick a random index with a value from 0 - i
            index = new Random().nextInt(i); // statement

            //appoint the value of temp to the value of current array index
            temp = array[i];  // statement

            //swap the value of current array index with the random index
            array[i] = array[index];  // statement

            //swap the value of the random array index with the value of the current array index
            array[index] = temp;  // statement
        }

    }
}
