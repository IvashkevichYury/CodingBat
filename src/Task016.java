/*Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.*/

public class Task016 {
    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 3));  // llollollo
        System.out.println(repeatEnd("Hello", 2));  // lolo
        System.out.println(repeatEnd("Hello", 1));  // o
    }

    public static String repeatEnd(String str, int n) {
        return str.substring(str.length() - n).repeat(Math.max(0, n));
    }
}
