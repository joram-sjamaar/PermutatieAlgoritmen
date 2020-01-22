package utils;

import java.util.Random;

public class Numbers {

    public static int generateRandomNumber(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1)); // 1 statement
    }

}
