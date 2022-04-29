/*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 3 int values, return true if 1 or more of them are teen.*/

public class Task002 {
    public static void main(String[] args) {
        System.out.println(hasTeen(10, 13, 20));
        System.out.println(hasTeen(10, 19, 20));
        System.out.println(hasTeen(10, 30, 20));
    }

    public static boolean hasTeen(int a, int b, int c) {
        return isTrue(a) || isTrue(b) || isTrue(c);
    }

    private static boolean isTrue(int a) {
        if (a >= 13 && a <= 19) {
            return true;
        } else
            return false;
    }

}
