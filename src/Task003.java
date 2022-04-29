/*Given a string and an int n, return a string made of the first and last n chars from the string.
The string length will be at least n.*/

public class Task003 {
    public static void main(String[] args) {
        System.out.println(nTwice("Hello", 2));          // "Helo"
        System.out.println(nTwice("Chocolate", 3));      // "Choate"
        System.out.println(nTwice("Chocolate", 1));      // "Ce"
    }

    public static String nTwice(String str, int n) {
        return str.substring(0, n).concat(str.substring(str.length() - n));
    }

}
