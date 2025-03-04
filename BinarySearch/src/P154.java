/**
 * Question: 154, https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
 * Level: Hard
 * This is an important question for BS.
 * Complexity: O(N) + O(logN) if there is duplicate
 * Omega(logN) if there is no duplicate which result the best case
 */
public class P154 {

    public static int findMin(int[] nums) {
        int left = -1;
        int right = nums.length;
        int ref_l = nums[left + 1];
        int ref_r = nums[right - 1];
        // Duplicate case will result the worst complexity O(N) + O(logN)
        while (ref_l == ref_r && left + 1 < right) {
            left++;
            ref_l = nums[left];
        }
        // Array is already sorted
        if (ref_l < ref_r || nums.length == 1) return ref_l;

        while (left + 1 < right) {
            int mid = (left + right) / 2;
            if (ref_l <= nums[mid]) {
                left = mid;
                ref_l = nums[left];
            } else {
                right = mid;
            }

        }
        // Right pointer not move, only happen when there is duplicate element (vs P153)
        if (right == nums.length) return nums[left];
        return nums[right];
    }

    public static void main(String[] args) {
        int[] nums = {1, 1};
        System.out.println(findMin(nums));

    }
}
