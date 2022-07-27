/*Given a list of strings, return a list where each string has "y" added at its end,
omitting any resulting strings that contain "yy" as a substring anywhere.*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task019 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa", "ay", "ya", "yya");
        System.out.println(list);
        System.out.println(noYY(list));
    }

    public static List<String> noYY(List<String> strings) {
        return strings.stream()
                .map(n -> n + "y")
                .filter(n -> !n.contains("yy"))
                .collect(Collectors.toList());
    }
}
