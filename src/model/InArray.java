package model;

public class InArray {
    public static boolean inArray(int number, int[] array) {

        for (int i = 0; i < array.length; i++) // N, 2 statements, 1 check
            if (array[i] == number) // 1 statement
                return true; // 1 statement

        return false;
    }
}
