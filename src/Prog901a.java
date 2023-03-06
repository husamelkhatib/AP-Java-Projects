import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prog901a {

    public static void main(String[] args) {
        String filename = "Langdat/prog512h.dat"; // the name of the input file
        File inputFile = new File(filename);
        try {
            // read the file and print its content in the original order
            Scanner scanner = new Scanner(inputFile);
            printFile(scanner);
            scanner.close();
            System.out.println();

            // read the file again and print its content in reverse order
            scanner = new Scanner(inputFile);
            printFileReverse(scanner);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: file not found");
        }
    }

    // recursive method that prints the content of a file using a Scanner object
    public static void printFile(Scanner scanner) {
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            printFile(scanner);
        }
    }

    // recursive method that prints the content of a file in reverse order using a Scanner object
    public static void printFileReverse(Scanner scanner) {
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            printFileReverse(scanner);
            System.out.println(reverseString(line));
        }
    }

    // utility method that returns a reversed version of a String
    public static String reverseString(String s) {
        if (s.length() == 0) {
            return "";
        } else {
            char firstChar = s.charAt(0);
            String rest = s.substring(1);
            String reversedRest = reverseString(rest);
            return reversedRest + firstChar;
        }
    }
}
