import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prog477a {
    public static void main(String[] args) {
        int[][] counts = new int[5][3]; // 2D array to store counts of men and women for each grade
        try {
            Scanner input = new Scanner(new File("data/prog477a.dat"));
            while (input.hasNext()) {
                int sex = input.nextInt();
                int grade = input.nextInt();
                counts[grade-1][sex-1]++; // increment count for corresponding grade and sex
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }

        System.out.println("Grade\tMale\tFemale\tTotal");
        for (int i = 0; i < 5; i++) {
            System.out.print((char)('A' + i) + "\t"); // print grade label
            int gradeTotal = 0; // variable to store total for current grade
            for (int j = 0; j < 2; j++) {
                System.out.print(counts[i][j] + "\t"); // print count for current sex
                gradeTotal += counts[i][j]; // add count to grade total
            }
            System.out.println(gradeTotal); // print grade total
        }

        System.out.println("___________________________");

        System.out.print("Totals\t");
        int sexTotal = 0; // variable to store total for current sex
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                sexTotal += counts[j][i]; // add count to sex total
            }
            System.out.print(sexTotal + "\t"); // print sex total
            sexTotal = 0; // reset sex total
        }
    }
}
