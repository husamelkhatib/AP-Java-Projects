import java.util.Scanner;

public class Prog54b {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What should the first number be?");
        int num1 = keyboard.nextInt();
        System.out.println("What should the second number be?");
        int num2 = keyboard.nextInt();
        System.out.println("What should the third number be?");
        int num3 = keyboard.nextInt();
        System.out.println("What should the fourth number be?");
        int num4 = keyboard.nextInt();

        float sum = num1 + num2 + num3 + num4;
        float average = sum/4;
        System.out.println("Your sum of the numbers is " + sum);
        System.out.println("Your average of the numbers is " + average);

    }
}
