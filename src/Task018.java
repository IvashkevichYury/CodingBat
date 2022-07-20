/*Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).*/

public class Task018 {
    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1));  // ktten
        System.out.println(missingChar("kitten", 0));  // itten
        System.out.println(missingChar("kitten", 4));  // kittn
    }

    public static String missingChar(String str, int n) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i != n) {
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }

}