import java.util.Scanner;
class LP310 {
    public static void main(String[] args) {
        Scanner thing = new Scanner(System.in);
        double tendered = 0;
        double change = 0;

        System.out.println("Enter the number of burgers");
        int numBurgers = thing.nextInt();
        System.out.println("Enter the number of frys");
        int numFrys = thing.nextInt();
        System.out.println("Enter the number of sodas");
        int numSodas = thing.nextInt();
        LP310Class stuff = new LP310Class(numBurgers, numFrys, numSodas, tendered);
        stuff.YES();
        double beforeTax = stuff.getMoneyBack();
        double afterTax = stuff.getAfterTax();
        double MORETAX = stuff.getMORETAX();

        System.out.println("Total before tax: " + beforeTax);
        System.out.println("Tax: " + MORETAX);
        System.out.println("Final total: " + afterTax);

        System.out.println("Enter amount tendered: ");
        thing.nextInt();
        change = stuff.getChange();
        System.out.println("Change: " + change);
    }
}