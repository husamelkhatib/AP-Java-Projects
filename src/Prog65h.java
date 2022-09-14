import java.util.*;
class Prog65h {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many pounds ");
        int poundsAmount = keyboard.nextInt();
        System.out.println("How many shillings ");
        double shillingsAmount = keyboard.nextDouble();
        System.out.println("How many pence ");
        double penceAmount = keyboard.nextDouble();

        double cents = (shillingsAmount * 5) / 100;
        double penceCents = penceAmount * 5 / 12 / 100;

        double DecPounds = poundsAmount + cents + penceCents;
        DecPounds = Math.round(DecPounds * Math.pow(10, 2)) / Math.pow(10, 2);
        System.out.println("Your Decimal pounds amount is " + DecPounds);
    }
}