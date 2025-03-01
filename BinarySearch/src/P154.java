/**
 * Question: 154, https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
 * Level: Hard
 * This is an important question for excluding.
 * Type: BS in an unordered and dynamic target.
 */
public class P154 {

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int target = nums[right];
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (nums[mid] < target){
                target = nums[mid];
                right = mid;
            } else if (nums[mid] == target) {
                if (left == right) {
                    break;
                }
                // Cant figure out
            } else {
                left = mid + 1;
            }

        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 1, 3};
        System.out.println(findMin(nums));

    }
}
