import java.util.Scanner;

public class Prog54cClass {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("what is the radius of the circle: ");
        double myRadius = keyboard.nextDouble();

        Cl54c wow = new Cl54c(myRadius);

        wow.setStuff();

        double circumference = wow.getCircumference();
        double area = wow.getArea();

        System.out.println("The area is " + area);
        System.out.println("The circumference is: " + circumference);
    }
}