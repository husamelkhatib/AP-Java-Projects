import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog214c.dat"));

            Scanner scanner = new Scanner(System.in);


            System.out.println("Enter the number of gallons of gasoline purchased:");
            double gallons = scanner.nextDouble();


            System.out.println("Enter the grade of gasoline purchased (R, P, or H):");
            String grade = scanner.next();
            double pricePerGallon = 0;
            switch (grade) {
                case "R":
                    pricePerGallon = 1.359;
                    break;
                case "P":
                    pricePerGallon = 1.479;
                    break;
                case "H":
                    pricePerGallon = 1.429;
                    break;
            }


            double gasolineCost = gallons * pricePerGallon;


            double carWashPrice = 2.00;
            if (gallons > 10) {
                carWashPrice *= 0.9;
            }
            if (gallons >= 20) {
                carWashPrice = 0.00;
            }

            System.out.println("Cost of gasoline: $" + gasolineCost);
            System.out.println("Price of car wash: $" + carWashPrice);

        } catch (
                IOException e) {
            System.out.println("Cant find data file ;(");
        }
    }
}