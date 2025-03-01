/**
 * Question: 35, https://leetcode.com/problems/search-insert-position/description/
 * Level: Easy
 * This is a simple question for concept introduction about Binary Search.
 * Type: BS in an ordered array.
 */
public class P35 {
    public static int searchInsert(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (target > nums[nums.length - 1]){
            return nums.length;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] lst = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(lst, target));
    }
}
