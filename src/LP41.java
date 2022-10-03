import java.util.*;
class LP41 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many copies? ");
        int copies = keyboard.nextInt();
        double cost = 0;
        double costPerCopy = 0;
        if (copies <= 0) {
            System.out.println("How many copies do you actually want");
            copies = keyboard.nextInt();
        }  else if ((copies > 0) && (copies < 100)) {
            costPerCopy = 0.3;
        } else if ((copies > 99) && (copies < 500)) {
            costPerCopy = 0.28;
        } else if ((copies > 499) && (copies < 750)){
            costPerCopy = 0.27;
        } else if ((copies > 749) && (copies < 1001)) {
            costPerCopy = 0.26;
        }  else {
            costPerCopy = 0.25;
        }
        cost = copies * costPerCopy;
        cost = Math.round(cost * Math.pow(10, 2)) / Math.pow(10, 2);
        System.out.println("Your total is: $" + cost);
    }
}