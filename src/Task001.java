/*Given a string, take the first 2 chars and return the string with the 2 chars added
at both the front and back, so "kitten" yields "kikittenki".
If the string length is less than 2, use whatever chars are there.*/

import java.util.Locale;

public class Task001 {
    public static void main(String[] args) {
        System.out.println(front22("kitten"));
    }

    public static String front22(String str) {
        int lengthAddedString = 2;
        if (lengthAddedString > str.length()) {
            lengthAddedString = str.length();
        }

        String addedString = str.substring(0, lengthAddedString);
        return addedString.concat(str).concat(addedString);
    }
}
