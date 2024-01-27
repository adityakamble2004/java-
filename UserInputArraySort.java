import java.util.Scanner;

public class UserInputArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize an array of size 10
        int[] array = new int[10];

        // Take input from the user to fill the array
        System.out.println("Enter 10 integers to fill the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Print the original array
        System.out.println("\nOriginal Array:");
        printArray(array);

        // Sort the array using bubble sort
        bubbleSort(array);

        // Print the sorted array
        System.out.println("\nSorted Array:");
        printArray(array);

        scanner.close();
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

    // Method to print an array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
