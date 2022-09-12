import java.util.Scanner;

public class Prog54c {

    static final double PI = 3.1415926535;
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("what is the radius of the circle: ");
        double radius = keyboard.nextFloat();
        System.out.println("The radius is " + radius);
        double area = PI * (radius * radius);
        System.out.println("The area is " + area);
        double circumference = 2 * PI * radius;
        System.out.println("The circumference is " + circumference);

    }
}
