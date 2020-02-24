package model;

public class UsedPerm {
    public static boolean run(int number, int[] array) {

        for (int i1 : array) // n
            if (i1 == number) // 1 statement
                return true; // 1 statement

        return false;
    }


}
