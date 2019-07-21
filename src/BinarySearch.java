public class BinarySearch {


    int binarySearch (int[] arr, int startIndex, int endIndex, int searchNumber) {
        return -1;
    }

    public static void main(String[] args) {

        BinarySearch bs = new BinarySearch();
        int[] arr = {1,2,3,4,5};
        int searchNumber = 4;
        int result = bs.binarySearch(arr, 0, arr.length-1, searchNumber);

        if (result == -1)
            System.out.println("Element is not present");
        else
            System.out.println("Element is present at index" + result);
    }

}



