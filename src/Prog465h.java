import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {  // on replit, may need to put "../data ..etc
            Scanner input = new Scanner(new File("data/prog465h.dat"));
            int rowc = input.nextInt();
            int colc = input.nextInt();

            int[][] mat = new int[rowc][colc];  // 5 rows 6 columns
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    mat[row][col] = input.nextInt();
                    // Read in a 5x5 matrix
                }
            }

            System.out.println("Original Matrix");
            for (int[] row : mat) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println();
            int cnt = 0;
            int cntnum = 0;
            int[][] amat = new int[3][3];
            for (int r = 0; r < mat.length; r++) {

                for (int c = 0; c < mat[0].length; c++) {

                    if(mat[r][c] != 0) {
                        amat[cnt][0] = r + 1;
                        amat[cnt][1] = c + 1;
                        amat[cnt][2] = mat[r][c];
                        cnt++;
                        cntnum++;
                    }

                }

            }
            for (int[] row : amat) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println("The original matrix is sparse.");

            rowc = input.nextInt();
            colc = input.nextInt();
            int[][] mat2 = new int[rowc][colc];  // 5 rows 6 columns
            for (int row = 0; row < mat2.length; row++) {
                for (int col = 0; col < mat2[0].length; col++) {
                    mat2[row][col] = input.nextInt();
                    // Read in a 5x5 matrix
                }
            }
            System.out.println("Original Matrix");
            for (int[] row : mat2) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println("The original matrix is abundant");

            rowc = input.nextInt();
            colc = input.nextInt();
            int[][] mat3 = new int[rowc][colc];  // 5 rows 6 columns
            for (int row = 0; row < mat3.length; row++) {
                for (int col = 0; col < mat3[0].length; col++) {
                    mat3[row][col] = input.nextInt();
                    // Read in a 5x5 matrix
                }
            }
            System.out.println("Original Matrix");
            for (int[] row : mat3) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println("The original matrix and the Sparse matrix are equally efficient.");

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}