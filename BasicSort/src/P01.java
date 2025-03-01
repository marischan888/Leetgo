import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 {
    public static int[] twoSum(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
               if ((nums[j] + nums[i]) == target ) {
                   result.add(j);
                   result.add(i);
                   break;
               }
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        int[] nums = {3, 3};
        Arrays.stream(twoSum(nums,6)).boxed().toList().forEach(ele -> System.out.println(ele));
    }
}
