/*You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2.
If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5.
Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.*/

public class Task004 {
    public static void main(String[] args) {
        System.out.println(redTicket(2, 2, 2));  //10
        System.out.println(redTicket(0, 0, 0));  //5
        System.out.println(redTicket(2, 1, 0));  //1
        System.out.println(redTicket(2, 2, 1));  //0
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        } else {
            return 0;
        }
    }
}
