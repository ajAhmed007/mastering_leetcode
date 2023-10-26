import java.util.*;
/**
 * LongestSubString_3
 */
public class LongestSubString_3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        char[] sChar = s.toCharArray();
        int count = 0;
        Map<Character, Integer> m = new HashMap<>();
        for(int i = 0; i < sChar.length; i++){
            if(!m.containsKey(sChar[i])){
                m.put(sChar[i], 1 );
                count++;
            }else{
                count = 0;
                m.clear();
            }
        }
        return count;

    }

    
}