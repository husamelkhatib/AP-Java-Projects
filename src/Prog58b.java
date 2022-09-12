import java.util.*;

public class Prog58b {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What should A be?");
        int A = keyboard.nextInt();
        System.out.println("What should B be?");
        int B = keyboard.nextInt();
        System.out.println("What should C be?");
        int C = keyboard.nextInt();

        double rootPos = (-B + Math.sqrt(B * B -  4 * A * C)) / 2 * A;
        double rootNeg = (-B - Math.sqrt(B * B -  4 * A * C)) / 2 * A;
        System.out.println("The first root is " + rootPos);
        System.out.println("The second root is " + rootNeg);
    }
}