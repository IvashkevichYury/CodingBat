/*Given two arrays of ints sorted in increasing order, outer and inner,
return true if all of the numbers in inner appear in outer.
The best solution makes only a single "linear" pass of both arrays,
taking advantage of the fact that both arrays are already in sorted order.*/

public class Task015 {
    public static void main(String[] args) {
        System.out.println(linearIn(new int[] {1, 2, 4, 6}, new int[] {2, 4}));  // true
        System.out.println(linearIn(new int[] {1, 2, 4, 6}, new int[] {2, 3, 4}));  // false
        System.out.println(linearIn(new int[] {1, 2, 4, 4, 6}, new int[] {2, 4}));  // true
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        int count = inner.length;
        for (int i : inner) {
            for (int j : outer) {
                if (i == j) {
                    count--;
                    break;
                }
            }
        }
        return count == 0;
    }
}
