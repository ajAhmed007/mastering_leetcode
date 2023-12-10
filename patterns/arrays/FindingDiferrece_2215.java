package patterns.arrays;
import java.util.*;
public class FindingDiferrece_2215 {
    public static void main(String[] args) {
        int[] num1 = {1,2,3};
        int[] num2 = {2,4,6}; 

        System.out.println(findDifference(num1, num2));
        
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // step1:
        // add all num1 to a set
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        // add all num2 to a set
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());

        // add elements to the second list that are in nums2 but not in nums1
        for (int num : set1) {
            if (!set2.contains(num)) {
                result.get(0).add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                result.get(1).add(num);
            }
        }

        return result;

    }
    
}
