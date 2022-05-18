/* We want to make a row of bricks that is goal inches long.
We have a number of small bricks (1 inch each) and big bricks (5 inches each).
Return true if it is possible to make the goal by choosing from the given bricks.
This is a little harder than it looks and can be done without any loops. */

public class Task009 {

    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));  // true
        System.out.println(makeBricks(1, 4, 12));  // false
        System.out.println(makeBricks(7, 1, 8));  // true
        System.out.println(makeBricks(3, 2, 9));  // false
        System.out.println(makeBricks(1000000, 1000, 1000100));  // true
    }

    public static boolean makeBricks(int small, int big, int goal) {
        return (small + big * 5 >= goal) && (goal % 5 <= small);
    }
}
