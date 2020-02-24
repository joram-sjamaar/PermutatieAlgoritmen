package utils;

import java.util.Random;

public class Numbers {

    public static int generateRandomNumber(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1)); // 1 statement
    }

    public static int [] randomArray(int n){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= new Random().nextInt();
        }
        return arr;
    }

    /**
     * Iterates trough the array checking if the randomly generated number is in the array.
     * @param number: the randomly generated number.
     * @param array: the array which is to eb iterated.
     * @return true if the number is in the array, false if not.
     */
    public static boolean inArray(int number, int[] array) {

        for (int i1 : array) // n
            if (i1 == number) // 1 statement
                return true; // 1 statement

        return false;
    }

}
