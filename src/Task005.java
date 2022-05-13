/*Given a string, return a string where for every char in the original, there are two chars.*/

public class Task005 {

    public static void main(String[] args) {
        System.out.println(doubleChar("The"));  // TThhee
        System.out.println(doubleChar("AAbb"));  // AAAAbbbb
        System.out.println(doubleChar("Hi-There"));  // HHii--TThheerree
    }

    public static String doubleChar(String str) {
        StringBuilder doubleString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            doubleString.append(str.charAt(i)).append(str.charAt(i));
        }
        return doubleString.toString();
    }
}
