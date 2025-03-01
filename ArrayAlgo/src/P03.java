import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.max;

public class P03 {
    // brute force
    // O(N + N) -> O(N)
    // the inner loop will not run N times for each outer iteration, so it is O(N + N)
    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        if (s.length() < 2) {return s.length();}

        int ptr = 0;
        for (int i = 1; i < s.length(); i++) {
            int j = ptr;
            while (j != i) {
                // BAD, can use hash
                if (s.charAt(j) != s.charAt(i)) {
                    j++;
                } else {
                    // change the right pointer
                    ptr = j + 1;
                    break;
                }
            }
            result = max(result, (i - ptr) + 1 );
        }
        return result;
    }

    // Improvement: Avoid inner loop by using extra memory, a little bit faster and make sense
    // O(N)
    public static int improveSolution(String s) {
        if (s.length() < 2) {return s.length();}

        Map<Character, Integer> frequency = new HashMap<>();
        int ptrL = 0;
        char[] temp = s.toCharArray();
        int result = 0;

        for (int ptrR = 0; ptrR < s.length(); ptrR++) {
            if (! frequency.containsKey(temp[ptrR])){
                frequency.put(temp[ptrR], ptrR);
            } else {
                // get the value of the left key
                Integer duplicateIndex = frequency.get(temp[ptrR]);
                // Tricky: Use max to force prtL only move to right
                ptrL = max(ptrL, duplicateIndex + 1);

                frequency.put(temp[ptrR], ptrR);
            }
            result = max(result, ptrR - ptrL + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        String test = "abba";
        System.out.println(improveSolution(test));
    }
}