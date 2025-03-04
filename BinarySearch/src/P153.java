/**
 * Question: 135, https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/1436425863/
 * Level: Medium
 * This is an important question for unordered and not duplicated BS.
 */
public class P153 {

    public static int findMin(int[] nums) {
        int left = -1;
        int right = nums.length;
        int ref_l = nums[left + 1];
        int ref_r = nums[right - 1];
        // special case: the array is already sorted
        if (ref_l <= ref_r) {
            return ref_l;
        }

        while (left + 1 != right) {
            int mid = (left + right) / 2;
            // blue zone: [left, mid], no min zone
            if (ref_l <= nums[mid]){
                left = mid;
            } else {
                // red zone: (mid, right], have min zone
                right = mid;
            }
        }
        // min in the red zone
        return nums[right];
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 1};
        System.out.println(findMin(nums));
    }
}
