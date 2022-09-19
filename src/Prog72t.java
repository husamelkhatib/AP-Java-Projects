import java.util.*;
public class Prog72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first time: ");
        int time1 = input.nextInt();
        System.out.println();
        System.out.println("Enter the second time: ");
        int time2 = input.nextInt();
        System.out.println();
        int time_difference = time1 - time2;
        if (time1 < time2) {
            time_difference = Math.abs(time_difference);
        }
        else {
            time_difference = time2 - time1 + 100;
            time_difference = Math.abs(time_difference);
time_difference = 2400 - time_difference;

        }
        int hours = time_difference / 100;
        time_difference = time_difference - (hours * 100);
        int minutes = time_difference;
        System.out.println("The difference is: " + hours + " hours and " + minutes + " minutes.");
    }
}