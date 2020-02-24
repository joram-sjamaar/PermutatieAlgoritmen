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

}
