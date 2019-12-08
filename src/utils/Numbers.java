package utils;

import java.util.Random;

public class Numbers {

    public static int generateRandomNumber(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1)); // 1 statement
    }

    public static boolean inArray(int number, int[] array) {

        for (int i = 0; i < array.length; i++) // N, 2 statements, 1 check
            if (array[i] == number) // 1 statement
                return true; // 1 statement

        return false;
    }

    public static int swapPerm(int [] array){
        int temp, index;

        for (int i = 0; i < array.length; i++) {
            // if i = 0 random function won't work, so index will always be 0 then.
            if (i>1)
                //pick a random index with a value from 0 - i
                index = new Random().nextInt(i);
            else index = 0;

            //appoint the value of temp to the value of current array index
            temp = array[i];
            //swap the value of current array index with the random index
            array[i] = array[index];
            //swap the value of the random array index with the value of the current array index
            array[index]= temp;
        }

        return 0;
    }

}
