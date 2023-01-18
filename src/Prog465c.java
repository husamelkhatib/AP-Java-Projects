import java.util.*;
class Prog465c {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        // Prompt user for matrix size
        System.out.print("Enter the number of rows in the matrix: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int columns = input.nextInt();

        // Create matrix and fill with user input
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the matrix values: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Initialize variable to store sum of edge values
        int sum = 0;

        // Add top row values
        for (int i = 0; i < columns; i++) {
            sum += matrix[0][i];
        }

        // Add bottom row values
        for (int i = 0; i < columns; i++) {
            sum += matrix[rows-1][i];
        }

        // Add left column values
        for (int i = 1; i < rows-1; i++) {
            sum += matrix[i][0];
        }

        // Add right column values
        for (int i = 1; i < rows-1; i++) {
            sum += matrix[i][columns-1];
        }

        // Print original matrix
        System.out.println("Original table");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Print sum of edge values
        System.out.println("The total of the edges is " + sum + ".");
    }

}
