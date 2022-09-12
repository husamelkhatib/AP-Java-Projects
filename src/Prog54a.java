import java.util.Scanner;

public class Prog54a {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the model of the car ");
        String model = keyboard.nextLine();

        System.out.print("How many miles were driven ");
        int miles = keyboard.nextInt();


        System.out.print("How many gallons were used ");
        int gallons = keyboard.nextInt();
        float mpg = (float)miles / (float)gallons;
        System.out.println("The average MPG used by the " + model + " are " + mpg + " m/g");
    }
}
