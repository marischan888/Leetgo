/**
 * Question: 135, https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/1436425863/
 * Level: Medium
 * This is an important question for unordered and not duplicated BS.
 */
public class P153 {

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left + 1)/2;
            if (nums[left] < nums[mid] && nums[left] < nums[right]) {
                left = left + 1;
            } else {
                right = right - 1;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5};
        System.out.println(findMin(nums));
    }
}
