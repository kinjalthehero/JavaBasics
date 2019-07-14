package practiceProblems.array;

import java.util.Arrays;

public class Array_MinTrainPlatform {

    static int findPlatformsRequiredForStation(int arr[], int dep[])
    {
        int platform_needed = 0;
        int maxPlatforms = 0;
        int i = 0, j = 0;

        Arrays.sort(arr);
        Arrays.sort(dep);

        while (i < arr.length && j < arr.length)
        {
            // If arrival < departure than we need a platform for train to stop
            // Increment number of platform
            // We already considered the arrival time so consider next arrival time
            if (arr[i] < dep[j])
            {
                platform_needed++;
                i++;

                if (platform_needed > maxPlatforms)
                    maxPlatforms = platform_needed;
            }
            // Train left. Platform is not needed now.
            // Consider next departure time
            else
            {
                platform_needed--;
                j++;
            }
        }
        return maxPlatforms;
    }

    public static void main(String args[])
    {
        // arr[] = {1:00, 1:40, 1:50, 2:00, 2:15, 4:00}
        // dep[] = {1:10, 3:00, 2:20, 2:30, 3:15, 6:00}

        int arr[] = {100, 140, 150, 200, 215, 400};
        int dep[] = {110, 300, 220, 230,315, 600};
        System.out.println("Minimum platforms needed:"+findPlatformsRequiredForStation(arr,dep));
    }
}