import java.util.*;

/**
 * LongestSubString_3
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">...</a>
 */
public class LongestSubString_3 {
    public static void main(String[] args) {
        String s = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        char[] sChar = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int max = 0;
        while (right < s.length()) {
            if (!set.contains(sChar[right])) {
                set.add(sChar[right]);
                right++;
                max = Math.max(max, right - left);
            }

            if (right < s.length() && set.contains(sChar[right])) {
                set.remove(sChar[left]);
                left++;
            }
        }
        return max;
    }
}