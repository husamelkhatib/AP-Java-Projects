import java.util.*;
class Prog93a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many KWH?");
        int KWH = keyboard.nextInt();
        double KWHCost = .0475;
        double KWHTotal = KWH * KWHCost;
        double surcharge = KWHTotal * .1;
        double CityTax = KWHTotal * .03;
        double TotalPay = KWHTotal + surcharge + CityTax;
        double LatePay = TotalPay * .04 + KWHTotal + surcharge + CityTax;
        KWHTotal = Math.round(KWHTotal * Math.pow(10, 2)) / Math.pow(10, 2);
        surcharge = Math.round(surcharge * Math.pow(10, 2)) / Math.pow(10, 2);
        CityTax = Math.round(CityTax * Math.pow(10, 2)) / Math.pow(10, 2);
        TotalPay = Math.round(TotalPay * Math.pow(10, 2)) / Math.pow(10, 2);
        LatePay = Math.round(LatePay * Math.pow(10, 2)) / Math.pow(10, 2);
        System.out.println("Your KWH cost is $" + KWHTotal);
        System.out.println("Your surcharge is $" + surcharge);
        System.out.println("Your tax is $" + CityTax);
        System.out.println("The total you have to pay is $" + TotalPay);
        System.out.println("The pay for being late is $" + LatePay);

    }
}