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
            if (i>1) index = new Random().nextInt(i);
            else index = 0;
            temp = array[i];
            array[i] = array[index];
            array[index]= temp;
        }

        return 0;
    }

}
