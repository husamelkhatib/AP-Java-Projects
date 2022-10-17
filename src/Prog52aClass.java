import java.util.Scanner;
public class Prog52aClass {
    // Driver program
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter length: ");
                int len = keyboard.nextInt();
        System.out.println("Please enter width: ");
        int wid = keyboard.nextInt();
        System.out.println();

        // Make a new object (instance) of Cl52a (instantiate the class)
        Cl52a wow = new Cl52a(len, wid);

        wow.setStuff();

        int area = wow.getArea();
        int perim = wow.getPerim();
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perim);
    }
}