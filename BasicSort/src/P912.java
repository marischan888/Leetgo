import java.util.Arrays;
import java.util.List;

public class P912 {
    // Selection sort, complexity is O(N^2)
    public static int[] selectSortArray(int[] nums) {
        int curMin;
        int len = nums.length;
        for (int i = 0; i < len; i++){
            int minIndex = i;
            curMin = nums[i];
            for (int j = i + 1; j < len; j++){
                // Idea 1: Continuously update the current minimum value in a competitive manner
                if (nums[j] < curMin) {
                    minIndex = j;
                    curMin = nums[minIndex];
                }
            }
            swap(nums, minIndex, i);
        }
        return nums;
    }

    // Example of insertion sort, time complexity O(N^2)
    // Way 1: Swap from tail to head
    public static int[] insertSortArray(int[] nums) {
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            int curIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[curIndex] < nums[j]) {
                    swap(nums, j, curIndex);
                    curIndex = j;
                } else {
                    break; // Difference comparing with selection sort: dont need to go through all element
                }
            }
        }
        return nums;
    }
    // Way 2: Save the temp and keep finding its proper position
    public static int[] insertSortArray2(int[] nums) {
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            int curIndex = i;
            int temp = nums[curIndex];
            for (int j = i - 1; j >= 0; j--) {
                if (temp < nums[j]) {
                    nums[curIndex] = nums[j];
                    curIndex -= 1;
                }
            }
            nums[curIndex] = temp;
        }
        return nums;
    }
    // Refine version of way2
    // Sentinel Value - a way to avoid use j >= 0 (provide a lower boundary);
    public static int[] insertSortArray3(int[] nums){
        int len = nums.length;
        int minIndex = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }
        // Key: Let sentinel as a guard stand for the lower bound
        swap(nums, 0, minIndex);
        for (int i = 1; i < len; i++) {
            int temp = nums[i];
            int curIndex = i;
            // Always not out of bound since there is a guard
            while (nums[curIndex - 1] > temp) {
                nums[curIndex] = nums[curIndex - 1];
                curIndex -= 1;
            }
            nums[curIndex] = temp;
        }
        return nums;
    }

    // Idea: Extract the swap logic as a private method to highlight the primary sorting logic.
    public static void swap(int[] nums, int minId, int curId){
        int temp = nums[curId];
        nums[curId] = nums[minId];
        nums[minId] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 2, -8, -10};
        List<Integer> lst = Arrays.stream(insertSortArray3(nums)).boxed().toList();
        lst.forEach(ele -> System.out.println(ele));
    }
}