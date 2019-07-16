package practiceProblems.array;

public class Array_PairClosestToANumber {

    public static void main(String[] args)
    {
        int array[] = {-40,-5,1,3,6,7,8,20};
        findPairWithClosestToXBruteForce(array,5);
        findPairWithClosestToX(array,5);
    }

    // Very similar to Pair closest to zero problem
    public static void  findPairWithClosestToXBruteForce(int arr[],int X)
    {
        if(arr.length < 2)
            return;

        int minimumDiff = Math.abs(arr[0] + arr[1] - X);
        int pair1stIndex=0;
        int pair2ndIndex=1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int tempDiff = Math.abs(arr[i] + arr[j] - X);

                if(tempDiff< minimumDiff)
                {
                    pair1stIndex=i;
                    pair2ndIndex=j;
                    minimumDiff=tempDiff;
                }
            }
        }

        System.out.println(" The pair whose sum is closest to X using brute force method: "+arr[pair1stIndex]+" "+ arr[pair2ndIndex]);
    }

    public static void findPairWithClosestToX(int arr[],int X) {

        int minimumDiff = Integer.MAX_VALUE;

        if(arr.length < 0)
            return;

        // left and right index variables
        int leftIndex = 0, rightIndex = arr.length - 1;

        // variable to keep track of the left and right pair for minimumSum
        int minLeft = leftIndex, minRight = arr.length - 1;

        while(leftIndex < rightIndex)
        {

            int currentDiff= Math.abs(arr[leftIndex] + arr[rightIndex] - X);

            /*If abs(diff) is less than min dif, we need to update sum and pair */
            if(currentDiff < minimumDiff)
            {
                minimumDiff = currentDiff;
                minLeft = leftIndex;
                minRight = rightIndex;
            }

            if(arr[leftIndex] + arr[rightIndex] < X)
                leftIndex++;
            else
                rightIndex--;
        }

        System.out.println(" The pair whose sum is closest to X : "+arr[minLeft]+" "+ arr[minRight]);
    }
}
