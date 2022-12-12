import java.util.*;
public class LP39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Birth year: ");
        int Byear = input.nextInt();

        System.out.print("Enter your Birth month: ");
        int Bmonth = input.nextInt();

        System.out.print("Enter the day your were born in: ");
        int Bday = input.nextInt();

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the month: ");
        int month = input.nextInt();

        System.out.print("Enter the day its now: ");
        int day = input.nextInt();

        LP39Class wow = new LP39Class(Byear, Bmonth, Bday, year, month, day);

        wow.setStuff();

        int alive = wow.getAlive();

        int sleep = wow.getSleep();

        System.out.println("You have been alive for " + alive + " days. ");
        System.out.println("You have slept for " + sleep + " Hours. ");

    }
}
