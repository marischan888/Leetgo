/**
 * Question: 704, https://leetcode.com/problems/binary-search/description/
 * Level: Easy
 * This is a simple question for concept introduction about Binary Search.
 * Type: BS in an ordered array.
 */
public class P704 {
    // Idea 1
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1 ;

        while (left <= right){      // Point1: search until there is no element in the array
            // Point2: (left + right)/2 might lead to int overflow when left and right are large.
            // here mid is on the left
            int mid = left + (right - left)/2;
            // Other method avoid overflow in java: unsigned right shift
            // int mid = (left + right) >>> 1;
            if (nums[mid] == target){
               return mid;
            }
            else if (nums[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
       return -1;
    }
    // Point 3: Why we choose 2 as space divider? Can we choose 4, 5, or 6?
    // Yes, we can. Since our idea is just look for target in different zone.

    // Idea 2
    public static int search2(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        // Point1: exclude until there is one element(target) left
        while (left < right){
            // Point 2: lower middle of upper middle, it depends on how u exclude
            int mid = left + (right - left) / 2;
            if (nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums[left] == target){
            return left;
        }
        return -1;
    }

    // Use Recursion
    public static int search_rec(int[] nums, int target){
        return binary_search(nums, 0, nums.length, target);
    }

    public static int binary_search(int[] nums, int left, int right,  int target){
        if (left <= right){ // Point 1
           int mid = left + (right - left)/2;
           if (nums[mid] == target){  // Point2: When to stop and pop from the stack
               return mid;
           } else if (nums[mid] < target) {
               return binary_search(nums, mid + 1, right, target); // Only return 4 since do not operate to mid
           }
           else {
               return binary_search(nums, left, mid - 1, target); // Only return 4
           }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9 ,12};
        int target = 9;
        int target2 = 2;

        System.out.print(search2(nums, target));
//        System.out.println(search_rec(nums, target));
    }
}
// Additional
// Java right shift: https://stackoverflow.com/questions/19058859/what-does-mean-in-java
// O(logN) -- geometric series' n：an = a1 * r ^ (1-n)