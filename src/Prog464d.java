import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog464d {

    public static int[][] transpose(int[][] mat) {
        int[][] transposed = new int[mat[0].length][mat.length];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                transposed[col][row] = mat[row][col];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/Prog464a.dat"));
            int[][] mat = new int[5][5];
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[row].length; col++) {
                    mat[row][col] = input.nextInt();
                }
            }
int[][] tMat = transpose(mat);

            System.out.println("Original Matrix");
            for (int[] r : mat) {
                for (int c : r) {
                    System.out.println(c + " ");
                }
                System.out.println();
            }

            System.out.println("Transposed Matrix");
            for (int[] r : tMat) {
                for (int c : r) {
                    System.out.println(c + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Cant find data file!");
        }
    }
}
