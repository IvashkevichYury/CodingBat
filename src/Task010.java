/*Given an array of scores, return true if each score is equal or greater than the one before.
The array will be length 2 or more.*/

public class Task010 {
    public static void main(String[] args) {
        System.out.println(scoresIncreasing(new int[]{1, 3, 4}));  // true
        System.out.println(scoresIncreasing(new int[]{1, 3, 2}));  // false
        System.out.println(scoresIncreasing(new int[]{1, 1, 4}));  // true
    }

    public static boolean scoresIncreasing(int[] scores) {
        boolean isTrue = true;
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                isTrue = false;
            }
        }
        return isTrue;
    }

}
