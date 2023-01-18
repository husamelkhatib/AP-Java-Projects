import java.io.*;
import java.util.*;

public class Prog470a {
    public static void main(String[] args) throws Exception {
        // Read the 5 x 5 array from the external data file
        Scanner in = new Scanner(new File("data/prog464a.dat"));
        int[][] arr = new int[6][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        // Find the sum of elements in each column and store in the 6th row
        for (int j = 0; j < 5; j++) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += arr[i][j];
            }
            arr[5][j] = sum;
        }

        // Print the final 6 x 5 array
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

