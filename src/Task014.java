/*Given a string, return the longest substring that appears at both the beginning and end of the string
without overlapping. For example, sameEnds("abXab") is "ab".*/

public class Task014 {
    public static void main(String[] args) {
        System.out.println(sameEnds("abXYab"));  // ab
        System.out.println(sameEnds("xx"));  // x
        System.out.println(sameEnds("xxx"));  // x
    }

    public static String sameEnds(String string) {
        String same = "";
        for (int i = 1; i < string.length()/2+1; i++) {
            if (string.substring(0, i).equals(string.substring(string.length()-i))) {
                same = string.substring(0, i);
            }
        }
        return same;
    }
}
