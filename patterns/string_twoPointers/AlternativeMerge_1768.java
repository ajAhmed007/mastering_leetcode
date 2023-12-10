package patterns.strings_twoPointers;

import java.util.*;

public class AlternativeMerge_1768 {
    public static void main(String[] args) {
        String word1 = "abc"
        String word2 = "pqr"
        System.out.println(mergeAlternately(word1, word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder alternatingMerge = new StringBuilder();

        int i = 0;
        int j = 0;

        int len1 = word1.length();
        int len2 = word2.length();

        //append the chars from word1 and word2 alternatively
        while (i < len1 && j < len2) {
            alternatingMerge.append(word1.charAt(i++));
            alternatingMerge.append(word2.charAt(j++));
        }

        // if characters remain in word1, append at the end
        while (i < len1) {
            alternatingMerge.append(word1.charAt(i++));
        }

        // if characters remain in word2, append at the end
        while (j < len2) {
            alternatingMerge.append(word2.charAt(j++));
        }

        return alternatingMerge.toString();

    }
}
