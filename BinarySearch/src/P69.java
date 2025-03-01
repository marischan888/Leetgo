/**
 * Question: 69, https://leetcode.com/problems/sqrtx/description/
 * Level: Easy
 * This is a tricky question for applying BS (ordered int) and how to avoid overflowing.
 * Type: BS in an int (naturally ascending)
 */
public class P69 {
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        // Key 1: avoid the special case and start from the normal case
        int left = 1;
        // hey2: avoid the large input lead to overflow
        int right = x / 2; // left need to start from 1 since right is x / 2 now.

        while (left < right) {
            int mid = left + (right - left + 1) / 2;
//            int midSqrt = mid * mid; // lead to overflow
            // Key3: further avoiding the overflow
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int test = 2147395599;
        System.out.println(mySqrt(test));
    }
}
