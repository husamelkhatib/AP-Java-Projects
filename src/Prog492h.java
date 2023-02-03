import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog492h {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(new File("data/prog492h.dat"));


            // read in the initial setup for the life matrix
            System.out.println("Enter the initial setup for the life matrix:");
            String[][] lifeMatrix = new String[30][30];
            for (int i = 0; i < 30; i++) {
                String line = input.nextLine();
                for (int j = 0; j < 30; j++) {
                    lifeMatrix[i][j] = line.charAt(j) == '*' ? "*" : " ";
                }
            }

            // print the initial setup
            System.out.println("Generation 0");
            printMatrix(lifeMatrix);

            // simulate 15 more generations
            for (int generation = 1; generation <= 15; generation++) {
                String[][] newLifeMatrix = new String[30][30];
                for (int i = 0; i < 30; i++) {
                    for (int j = 0; j < 30; j++) {
                        int liveNeighbors = countLiveNeighbors(lifeMatrix, i, j);
                        if (lifeMatrix[i][j].equals("*")) {
                            if (liveNeighbors < 2 || liveNeighbors > 3) {
                                newLifeMatrix[i][j] = " ";
                            } else {
                                newLifeMatrix[i][j] = "*";
                            }
                        } else {
                            if (liveNeighbors == 3) {
                                newLifeMatrix[i][j] = "*";
                            } else {
                                newLifeMatrix[i][j] = " ";
                            }
                        }
                    }
                }
                lifeMatrix = newLifeMatrix;

                // print the current generation
                System.out.println("Generation " + generation);
                printMatrix(lifeMatrix);

            }
        } catch (IOException e){
            System.out.println("Cant find data file!");
        }
    }

    public static int countLiveNeighbors(String[][] matrix, int i, int j) {
        int count = 0;
        for (int x = i - 1; x <= i + 1; x++) {
            for (int y = j - 1; y <= j + 1; y++) {
                if (x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length) {
                    if (x != i || y != j) {
                        if (matrix[x][y].equals("*")) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
