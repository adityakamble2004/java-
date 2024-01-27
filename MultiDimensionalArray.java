public class MultiDimensionalArray {
    public static void main(String[] args) {
        // Create a 2D array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Display the original array
        System.out.println("Original Array:");
        displayArray(array);

        // Perform arithmetic operations
        int sum = sumArray(array);
        double average = averageArray(array);

        // Display the results
        System.out.println("\nSum of all elements: " + sum);
        System.out.println("Average of all elements: " + average);
    }

    // Method to display the array
    public static void displayArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Method to calculate the sum of all elements in the array
    public static int sumArray(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }

    // Method to calculate the average of all elements in the array
    public static double averageArray(int[][] array) {
        int sum = sumArray(array);
        int count = array.length * array[0].length;
        return (double) sum / count;
    }
}
