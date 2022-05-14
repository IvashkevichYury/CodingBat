/*Given a string and a non-negative int n, return a larger string that is n copies of the original string.*/

public class Task006 {
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 0));
        System.out.println(stringTimes("Hi", 1));
    }

    public static String stringTimes(String str, int n) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < n; i++) {
            newString.append(str);
        }
        return newString.toString();
    }
}
