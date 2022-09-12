import java.util.*;

public class Prog58i {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the amount?");
        double Amount = keyboard.nextDouble();
        System.out.println("How long in years?");
        double TimeYears = keyboard.nextDouble();
        System.out.println("What is the rate?");
        double Rate = keyboard.nextDouble();

        double MonthlyPayment = Amount * (Rate / 1200) * 1 + (Math.pow((Rate / 1200), TimeYears) / (Math.pow((Rate / 1200), TimeYears) - 1));
        double InterestPayBack = MonthlyPayment * TimeYears;
        double TotalPayBack = Amount + (MonthlyPayment * TimeYears);
        MonthlyPayment = Math.round(MonthlyPayment * Math.pow(10, 2)) / Math.pow(10, 2);
        InterestPayBack = Math.round(InterestPayBack * Math.pow(10, 2)) / Math.pow(10, 2);
        TotalPayBack = Math.round(TotalPayBack * Math.pow(10, 2)) / Math.pow(10, 2);
        System.out.println("Your monthly payment is: $" + MonthlyPayment);
        System.out.println("Your total interest pay back is: $" + InterestPayBack);
        System.out.println("Your total pay back is: $" + TotalPayBack);


    }
}