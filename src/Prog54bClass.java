import java.util.Scanner;

public class Prog54bClass {

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

        Cl54b wow = new Cl54b(num1, num2, num3, num4);

        wow.setStuff();
        int sum = wow.getSum();
        System.out.print("The sum is: "  + sum);
    }
}