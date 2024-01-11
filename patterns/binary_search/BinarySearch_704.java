package patterns.binary_search;

public class BinarySearch_704 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        System.out.println(search(nums,target));
    }

    /**
     * Given an array of integers nums which is sorted
     * in ascending order, and an integer target,
     * write a function to search target in nums.
     * If target exists, then return its index.
     * Otherwise, return -1.You must write an algorithm
     * with O(log n) runtime complexity.
     * @param nums input array
     * @param target to be found in nums
     * @return index of target in nums array
     * nums = [-1,0,3,5,9,12], target = 9
     * Output: 4
     */
    public static int search(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int middle = (left + right) / 2;
            if(target == nums[middle]){
                return middle;
            }else if(target > nums[middle]){
                //ignore the left
                left = middle + 1;
            }else{
                //ignore the right
                right = middle - 1;
            }
        }
        //target not found in nums array
        return -1;
    }
}
