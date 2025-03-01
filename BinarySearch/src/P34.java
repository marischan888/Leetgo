import java.util.Arrays;
import java.util.List;

/**
 * Question: 34, https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * Level: Medium
 * This is an important question for concept about boundary define.
 * Type: BS in an ordered array.
 */
public class P34 {
    // Set up the framework is important for the basic
    public static int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return new int[]{-1, -1};
        }
        int firstPos = searchFirstPos(nums, target);
        if (firstPos == -1) {
            return new int[]{-1, -1};
        }
        int lastPos = searchLastPos(nums, target);
        return new int[] {firstPos, lastPos};
    }

    public static int searchFirstPos(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }

    public static int searchLastPos(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        if (nums[left] == target){
            return left;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        // crazy black magic behind jdk 21
        List<Integer> arrLst = Arrays.stream(searchRange(nums, target)).boxed().toList();
        arrLst.forEach(ele -> System.out.println(ele));

    }
}