package practiceProblems.array;

public class Array_SearchInSortedMatrix {

    public static void main(String[] args) {
        int[][] sortedMatrix =
                {
                        { 1, 6, 10, 12, 20 },
                        { 4, 8, 15, 22, 25 },
                        { 5, 20, 35, 37, 40 },
                        { 10, 28, 38, 45, 55 }
                };

        searchElementInSortedMatrix(sortedMatrix, 37);
    }

    private static void searchElementInSortedMatrix(int[][] sortedMatrix, int elementToSearch)
    {
        int rowLength = sortedMatrix.length;
        int columnLength = sortedMatrix[0].length;
        int currRow = 0, currColumn = columnLength - 1;

        while (currRow <= rowLength - 1 && currColumn >= 0)
        {
            if (sortedMatrix[currRow][currColumn] == elementToSearch)
            {
                System.out.println("Element found at currRow =" + currRow + " currColumn=" + currColumn);
                return;
            }
            if (elementToSearch < sortedMatrix[currRow][currColumn])
            {
                currColumn = currColumn - 1;
            }
            else
            {
                currRow = currRow + 1;
            }
        }
        System.out.println("Element is not found in sorted matrix");
    }
}
