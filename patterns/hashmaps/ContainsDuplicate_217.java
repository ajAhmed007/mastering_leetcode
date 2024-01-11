package patterns.hashmaps;
import java.util.*;
public class ContainsDuplicate_217 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));

    }
    public static boolean containsDuplicate(int[] nums ){
        //map to hold each number in nums and their count
        Map<Integer, Integer> hm = new HashMap<>();

        //loop through the nums array
        for(int i =0; i < nums.length; i++){
            //check if each nums[i] is in the hm
            if(hm.containsKey(nums[i])) {
                //duplicate found
                return true;
            }else{
                //add nums[i] to the hm
                hm.put(nums[i],i);
            }
        }

        //no duplicates found
        return false;
    }

}

