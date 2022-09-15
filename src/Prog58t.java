import java.util.*;
public class Prog58t {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the total of your items?");
        double AmountDue = keyboard.nextDouble();
        System.out.println("What is the total amount you have payed?");
        double AmountPayed = keyboard.nextDouble();

        double ChangeDue = AmountPayed - AmountDue;
        double ChangeDue2 = AmountPayed - AmountDue;
        int dollars = (int) ChangeDue / 1;
        ChangeDue = ChangeDue % 1;

        double quarters = (int) (ChangeDue / 0.25);
        ChangeDue = ChangeDue % 0.25;

        int dimes = (int) (ChangeDue / 0.1);
        ChangeDue = ChangeDue % 0.1;

        int nickels = (int) (ChangeDue / 0.05);
        ChangeDue = ChangeDue % 0.05;

        int pennies = (int)(ChangeDue / 0.01);
        ChangeDue = ChangeDue % 0.01;
        ChangeDue2 = Math.round(ChangeDue2 * Math.pow(10, 2)) / Math.pow(10, 2);
        System.out.println("The total price was " + AmountDue);
        System.out.println("You payed " + AmountPayed);
        System.out.println("Your change is "+ ChangeDue2);
        System.out.println("Dollars " + dollars);
        System.out.println("quarters " + quarters);
        System.out.println("dimes " + dimes);
        System.out.println("nickels " + nickels);
        System.out.println("pennies " + pennies);
    }
}