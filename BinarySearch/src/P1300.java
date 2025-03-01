import java.util.Arrays;
import java.util.List;

import static java.lang.Math.abs;

public class P1300 {
    public static int findBestValue (int[] arr, int target) {
        // arr [4, 9, 3], target 10 -> out:3
        // search: a minimum number, when changing all the number larger than it and sum up the arr, the sum should closest to the target
        // Sum the array
        int minDiff = abs(target - sunArr(arr)); // dynamic change
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            // dont figure out the logic yet
//            if () {
//
//            }

        }

        return -1;
    }
    public static int sunArr (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {

    }
}
