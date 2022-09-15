import java.util.*;
class Prog82a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the speed limit?");
        int speedLimit = keyboard.nextInt();
        System.out.println("What speed were you driving?");
        int speedDriving = keyboard.nextInt();
        double ticketCost = 20 + (speedDriving - speedLimit) * 5;
        System.out.println("Your total fine is $" + ticketCost);
    }
}