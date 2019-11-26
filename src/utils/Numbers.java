package utils;

public class Numbers {

    public static int generateNumber(int max, int[] array) {
        boolean unused = false;
        while (!unused) {
            int number = generateRandomNumber(0, max);
            if (!inArray(number, array)) {
                return number;
            }
        }

        return 0;
    }

    public static int generateRandomNumber(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public static boolean inArray(int number, int[] array) {

        for (int i = 0; i < array.length; i++)
            if (array[i] == number)
                return true;

        return false;
    }


}
