import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog209a {
    public static void main(String []args) {
        try {
            Scanner input = new Scanner(new File("data/prog215a.dat"));
            int lessThan = 0;
            int greaterThan = 0;
            int counter = 0;

            while (input.hasNext()) {
                int numbers = input.nextInt();
                if (numbers < 500) {
                    lessThan ++;

                } else {
                    greaterThan ++;
                }


            }
            counter = greaterThan + lessThan;
            System.out.println("Numbers less than 500: " + lessThan);
            System.out.println("Numbers greater than 500: " + greaterThan);
            System.out.println("Total numbers: " + counter);
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}