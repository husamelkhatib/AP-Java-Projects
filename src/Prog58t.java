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
        double QuarterIf = ChangeDue - dollars;
        int quarters = 0;
        if (QuarterIf < 0.5 && QuarterIf >= 0.25) {
            quarters = 1;
        } else if (QuarterIf >= 0.5 && QuarterIf < 0.75) {
            quarters = 2;
        }else if (QuarterIf >= 0.75){
            quarters = 3;
        } else {
            quarters = 0;
        }
        double QuarterPrice = quarters * 0.25;

        double DimeIf = ChangeDue - dollars - QuarterPrice;
        int dimes = 0;
        if (DimeIf < 0.2 && DimeIf >= 0.1) {
            dimes = 1;
        } else if (DimeIf >= 0.2) {
            dimes = 2;
        } else {
            dimes = 0;
        }
        double DimePrice = dimes * 0.1;

        double NickelIf = ChangeDue - dollars - QuarterPrice - DimePrice;
        int nickels = 0;
        if (NickelIf >= 0.05) {
            nickels = 1;
        } else {
            nickels = 0;
        }
        double NickelPrice = nickels * 0.05;

        double PennyIf = ChangeDue - dollars - QuarterPrice - DimePrice - NickelPrice;
        int pennies = 0;
        if (PennyIf < 0.02 && PennyIf >= 0.01) {
            pennies = 1;
        } else if (PennyIf >= 0.02 && PennyIf < 0.03) {
            pennies = 2;
        }  else if (PennyIf >= 0.03 && PennyIf < 0.04) {
            pennies = 3;
        }else if (PennyIf >= 0.04){
            pennies = 4;
        } else {
            pennies = 0;
        }



        ChangeDue = Math.round(ChangeDue * Math.pow(10, 2)) / Math.pow(10, 2);
        AmountDue = Math.round(AmountDue * Math.pow(10, 2)) / Math.pow(10, 2);
        AmountPayed = Math.round(AmountPayed * Math.pow(10, 2)) / Math.pow(10, 2);
        System.out.println("The amount due is: $" + AmountDue);
        System.out.println("The amount payed was: $" + AmountPayed);
        System.out.println("The change due is: $" + ChangeDue);
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}