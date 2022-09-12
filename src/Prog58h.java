import java.text.DecimalFormat;
import java.util.*;

public class Prog58h {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the amount?");
        double OriginalAmount = keyboard.nextDouble();
        System.out.println("What is the interest rate?");
        double Rate = keyboard.nextDouble();
        System.out.println("What is the number of days compounded per year?");
        double Compound = keyboard.nextDouble();
        System.out.println("What is the number of days at interest?");
        double Days = keyboard.nextDouble();

        double AmountInt = (OriginalAmount * Math.pow((1 + ((.01 * Rate) / Compound)), ((Compound * Days) / 365))) - OriginalAmount;
        double Amount = OriginalAmount * Math.pow((1 + ((.01 * Rate) / Compound)), ((Compound * Days) / 365));
        Amount = Math.round(Amount * Math.pow(10, 2)) / Math.pow(10, 2);
        AmountInt = Math.round(AmountInt * Math.pow(10, 2)) / Math.pow(10, 2);
        System.out.println("Your total interest gain is: $" + AmountInt);
        System.out.println("Your total amount is: $" +  Amount);

    }
}