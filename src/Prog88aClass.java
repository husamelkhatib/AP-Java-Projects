import java.util.Scanner;
public class Prog88aClass {


    public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
System.out.println("What should the first number be");
int num1 = keyboard.nextInt();
System.out.println("What should the second number be");
int num2 = keyboard.nextInt();
        Cl88a wow = new Cl88a(num1, num2);

        wow.setStuff();

        int sum = wow.getSum();
        int dif = wow.getDif();
        int prod = wow.getProd();
        int avg = wow.getAvg();
        int abb = wow.getAbb();
        int max = wow.getMax();
        int min = wow.getMin();


        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + dif);
        System.out.println("Product = " + prod);
        System.out.println("Average = " + avg);
        System.out.println("Absolute Value = " + abb);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }

}