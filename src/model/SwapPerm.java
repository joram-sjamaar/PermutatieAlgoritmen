package model;

import java.util.Random;

public class SwapPerm {
    public static void run(int [] array){
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

    }
}
