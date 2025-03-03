/***
 * This is a draft for debugging
 */
import java.util.Arrays;

import static java.lang.Integer.min;


public class Draft {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        int mid = 0; // set min to mid
        int result = nums[left];

        while (left <= right) {
            result = min(result, nums[mid]);
            mid = left + (right - left + 1)/2;
            if (nums[left] == nums[right]) {
                if (nums[left] >= nums[mid]) {
                    left = left + 1;
                } else if (nums[left] < nums[mid]) {
                    right = right - 1;
                }
            } else if (nums[left] < nums[right]){
                if (nums[left] < nums[mid]) {
                    right = right - 1;
                } else {
                    left = left + 1;
                }
            } else {
                if (nums[mid] > nums[right]) {
                    left = left + 1;
                } else {
                    left = left + 1;
                }
            }
        }
        return result;
    }
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            int mid = left + (right - left + 1) / 2;
            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] < target){
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        if (nums[left] == target){
            return left;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1};
        System.out.println(findMin(nums));
    }
}
