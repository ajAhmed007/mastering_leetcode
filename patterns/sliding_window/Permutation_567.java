import java.util.*;

/**
 * Permutation_567
 * https://leetcode.com/problems/permutation-in-string/
 */
public class Permutation_567 {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        // Check if s1 is longer than s2, in which case it can't be a substring.
        if (s1.length() > s2.length()) {
            return false;
        }

        // Create character count arrays for s1 and the current window in s2
        int[] countS1 = new int[26]; // Assuming only lowercase English letters
        int[] countS2 = new int[26]; // For counting character occurrences

        // Initialize character counts for s1 and the first window in s2
        for (int i = 0; i < s1.length(); i++) {
            // Count the characters in both strings
            countS1[s1.charAt(i) - 'a']++; // Increment count for the character in s1
            countS2[s2.charAt(i) - 'a']++; // Increment count for the character in the current window of s2
        }

        for (int i = 0; i < s2.length() - s1.length(); i++) {
            // Check if the character counts in the current window of s2 match s1
            if (Arrays.equals(countS1, countS2)) {
                return true;
            }

            // Move the sliding window to the right
            // Decrement the count of the leftmost character that is now out of the window
            countS2[s2.charAt(i) - 'a']--;
            // Increment the count of the next character to the right that enters the window
            countS2[s2.charAt(i + s1.length()) - 'a']++;
        }

        // Check the last window
        if (Arrays.equals(countS1, countS2)) {
            return true;
        }

        // If we haven't found a match by this point, return false
        return false;
    }
}