import java.util.Scanner;

public class Prog82aClass {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What was the speed limit");
        int mySpeedLimit = keyboard.nextInt();
        System.out.println("What was your driving speed");
        int mySpeedDriving = keyboard.nextInt();

        Cl82a wow = new Cl82a(mySpeedDriving, mySpeedLimit);

        wow.setStuff();


        double myTicketCost = wow.getTicketCost();
        System.out.println("Your total fine is $" + myTicketCost);
    }
}