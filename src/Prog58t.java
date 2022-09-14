import java.util.*;
public class Prog58t {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the total of your items?");
        double AmountDue = keyboard.nextDouble();
        System.out.println("What is the total amount you have payed?");
        double AmountPayed = keyboard.nextDouble();

        double ChangeDue = AmountPayed - AmountDue;
        int dollars = (int) (ChangeDue);

    }
}