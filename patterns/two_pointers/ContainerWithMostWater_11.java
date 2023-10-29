package patterns.two_pointers;

public class ContainerWithMostWater_11 {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            // Calculate the area between the two pointers
            int area = Math.min(height[left], height[right]) * (right - left);

            // Update the maximum area if the current area is greater
            maxArea = Math.max(maxArea, area);

            // Move the pointer pointing to the shorter line towards the other pointer
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }


    
}
