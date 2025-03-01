// It will over time for the large input if use selection sort(violet)
// Should use two pointers
public class P11 {
    public static int maxArea(int[] height) {
        int len = height.length;
        int maxArea = 0;
        for (int i = 0; i< len; i++) {
           for (int j = i + 1; j < len; j++) {
               int curArea = findCurArea(height, i, j);
               if (maxArea < curArea) {
                   maxArea = curArea;
               }
           }
        }
        return maxArea;
    }
    public static int findCurArea(int[] height, int left, int right) {
        int curArea = 0;
        if ((height[left] - height[right]) > 0) {
           curArea = height[right] * (right - left);
        } else {
            curArea = height[left] * (right - left);
        }
        return curArea;
    }
    public static void main(String[] args) {
        int[] height = {1, 1};
        System.out.println(maxArea(height));
    }
}
