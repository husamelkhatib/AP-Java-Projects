import java.util.*;
class Prog465a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int[][] matrix1 = new int[4][4];
        System.out.println("Enter the elements of Matrix 1 (4x4):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        int[][] matrix2 = new int[4][4];
        System.out.println("Enter the elements of Matrix 2 (4x4):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }


        int[][] largestElements = new int[4][4];
        // Compare and store the larger elements in third array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                largestElements[i][j] = Math.max(matrix1[i][j], matrix2[i][j]);
            }
        }

        System.out.println("Matrix 1\t\tMatrix 2");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.print("\t");
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nLargest Elements");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(largestElements[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
