package patterns.sorting;
import java.util.*;
public class CountPairs_2824 {
    public int countPairs(List<Integer> nums, int target) {
        // sort the numbers
        Collections.sort(nums);

        int count = 0;

        int left = 0;
        int right = nums.size() - 1;

        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                count += right - left; // all nums between right to left
                left++;
            } else {
                right--; // shrink the right
            }
        }
        return count;
    }
    
}
