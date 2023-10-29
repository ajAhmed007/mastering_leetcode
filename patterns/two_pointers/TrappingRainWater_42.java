package patterns.two_pointers;

public class TrappingRainWater_42 {

    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(trap(height));
    }

    public static int trap(int[] height) {

        int left = 0;

        int right = 0;
        int sum = 0;

        for (int i = 0; i < height.length - 1; i++) {

            // calculate the longest left relative to the current position (height[i])
            left = height[i];
            for (int j = i; j >= 0; j--) {
                left = Math.max(left, height[j]);
            }
            // calculate the longest right relative to the current position (height[i])
            right = height[i];
            for (int j = i + 1; j < height.length; j++) {
                right = Math.max(right, height[j]);
            }
            // take the min of the right and left, because that is going to tell us if it
            // can hold water, at the current position
            sum += Math.min(left, right) - height[i];
        }
        // all the water betweeen heights
        return sum;

    }
    
}
