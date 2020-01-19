package practiceProblems.array;

public class Array_Leet_ContainerWithMostWater {

    public static int maxArea(int[] height)
    {
        int currArea=0, maxarea = 0, left = 0, right = height.length - 1;

        while (left < right)
        {
            if (height[left] < height[right]) {
                currArea = height[left] * (right - left);
                left ++;
            }
            else
            {
                currArea = height[right] * (right - left);
                right--;
            }

            if (currArea > maxarea)
                maxarea = currArea;
        }

        return maxarea;
    }

    public static void main(String[] args) {

        int[] input = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(input));
    }

}
