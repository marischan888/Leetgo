/**
 * Question: 154, https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
 * Level: Hard
 * This is an important question for unordered and duplicated BS.
 */
public class P154 {

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left + 1)/2;
            if (nums[left] != nums[right]) {
                if (nums[left] < nums[mid] && nums[left] < nums[right]) {
                    right = right - 1;
                } else {
                    left = left + 1;
                }
            } else {
                if (nums[left] < nums[mid]) {
                    left = left + 1;
                } else {
                    right = right - 1;
                    left = left + 1;
                }
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 1, 3};
        System.out.println(findMin(nums));

    }
}
