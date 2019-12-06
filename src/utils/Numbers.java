package utils;

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


}
