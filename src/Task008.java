/*Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.*/

public class Task008 {
    public static void main(String[] args) {
        System.out.println(diff21(19));  // 2
        System.out.println(diff21(21));  // 0
        System.out.println(diff21(30));  // 18
        System.out.println(diff21(0));  // 21
        System.out.println(diff21(-2));  // 23
    }

    public static int diff21(int n) {
        return (21 > n) ? (21 - n) : ((n - 21) * 2);
    }
}
