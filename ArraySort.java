import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(array));

        // Sort the array using bubble sort
        bubbleSort(array);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    // Bubble sort algorithm
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
