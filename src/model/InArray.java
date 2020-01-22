package model;

public class InArray {
    public static boolean run(int number, int[] array) {

        for (int i1 : array)
            if (i1 == number) // 1 statement
                return true; // 1 statement

        return false;
    }
}
