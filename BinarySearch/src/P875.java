/**
 * Question: 875, https://leetcode.com/problems/koko-eating-bananas/description/
 * Level: Medium
 */
public class P875 {
    public static int minEatingSpeed(int[] piles, int h) {
        int maxVal = 1;
        for (int ele : piles) {
            maxVal = Math.max(maxVal, ele);
        }
        int left = 1;
        int right = maxVal;
        while (left < right) {
            int mid = left + (right - left)/2;
            if (sumHour(piles, mid) > h) {
                left = mid + 1;
            } else {
                // if the h is equal, it save and try to keep looking for a hour that is smaller the h
                // BUT we can not avoid the situation for v under h == hour: The trick point!!!!!
                // So cant use mid = left + (right - left + 1)/2;
                right = mid;
            }
        }
        return left;
    }

    public static int sumHour(int[] piles, int v) {
        int hour = 0;
        for (int ele : piles) {
            // Best way to choose the largest closest int
            // Cant use ceil(ele/7) since in Java ele/7 is already a int 2, then ceil(2) is 2
            hour = hour + (ele + v - 1) / v;
        }
        return hour;
    }

    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 6;
        System.out.println(minEatingSpeed(piles, h));
    }
}
