import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prog295c {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("merge1.dat"));
        Scanner input2 = new Scanner(new File("merge2.dat"));

        System.out.println("social sec#  Class Type Dept");

        String line1 = getNextLine(input1);
        String line2 = getNextLine(input2);

        while (line1 != null || line2 != null) {
            if (line1 == null) {
                printEmployee(line2);
                line2 = getNextLine(input2);
            } else if (line2 == null) {
                printEmployee(line1);
                line1 = getNextLine(input1);
            } else if (getSSN(line1).compareTo(getSSN(line2)) < 0) {
                printEmployee(line1);
                line1 = getNextLine(input1);
            } else {
                printEmployee(line2);
                line2 = getNextLine(input2);
            }
        }

        input1.close();
        input2.close();
    }

    private static String getNextLine(Scanner input) {
        if (input.hasNextLine()) {
            return input.nextLine();
        } else {
            return null;
        }
    }

    private static String getSSN(String line) {
        return line.substring(0, 11);
    }

    private static void printEmployee(String line) {
        String ssn = getSSN(line);
        String classification = line.substring(12, 13);
        String type = line.substring(14, 15);
        String dept = line.substring(16);

        System.out.printf("%s   %s      %s     %s\n", ssn, classification, type, dept);
    }
}
