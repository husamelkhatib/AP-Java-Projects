import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prog470b {
    public static void main(String[] args) {
        // initialize variables
        int[][] matrix = new int[5][5];
        int mainDiagSum = 0;
        int otherDiagSum = 0;

        // read data from external file
        try {
            Scanner input = new Scanner(new File("data/prog464a.dat"));
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    matrix[i][j] = input.nextInt();
                }
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            System.exit(1);
        }

        // find diagonal sums
        for (int i = 0; i < 5; i++) {
            mainDiagSum += matrix[i][i];
            otherDiagSum += matrix[i][4-i];
        }

        // print matrix
        System.out.println("Original Matrix");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // print diagonal sums
        System.out.println("Main Diagonal Sum " + mainDiagSum);
        System.out.println("Other Diagonal Sum " + otherDiagSum);
    }
}


