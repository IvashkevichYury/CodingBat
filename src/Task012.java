/*Given an array of ints, return the sum of the first 2 elements in the array.
If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.*/

public class Task012 {
    public static void main(String[] args) {
        System.out.println(sum2(new int[] {1, 2, 3}));  // 3
        System.out.println(sum2(new int[] {4}));  // 4
        System.out.println(sum2(new int[] {}));  // 0
        System.out.println(sum2(new int[] {1, 1, 1}));  // 2
    }

    public static int sum2(int[] nums) {
        int sum = 0;
        if (nums.length == 0) {

        } else if (nums.length < 2) {
            sum = nums[0];
        } else sum = nums[0] + nums[1];
        return sum;
    }
}
