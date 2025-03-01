/**
 * Question: 135, https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/1436425863/
 * Level: Medium
 * This is an important question for excluding.
 * Type: BS in an unordered and dynamic target.
 */
public class P153 {

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int target = nums[right];
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (nums[mid] < target){
                // Key: keep updating the target we are looking for, the minimal
                target = nums[mid];
                right = mid;
            } else if (nums[mid] == target) {
                break;
            } else {
                left = mid + 1;
            }

        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5};
        System.out.println(findMin(nums));

    }
}
