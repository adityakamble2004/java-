import java.util.Scanner;

public class star_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pyramid: ");
        int numRows = scanner.nextInt();

        // Outer loop for the number of rows
        for (int i = 1; i <= numRows; i++) {

            // Inner loop for spaces before the starsgit
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            // Inner loop for printing stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
