public class Jagged {
    public static void main(String[] args) {
        // Create a jagged array
        int[][] jaggedArray = {
            {1, 2},
            {3},
            {4,5,6}
        };

        // Accessing elements of the jagged array
        System.out.println("Elements of the jagged array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
