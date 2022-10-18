import java.util.Scanner;
import static  java.lang.System.out;
public class Prog52aClass {
    // Driver program
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.println("Please enter length: ");
                int len = keyboard.nextInt();
        out.println("Please enter width: ");
        int wid = keyboard.nextInt();
        out.println();

        // Make a new object (instance) of Cl52a (instantiate the class)
        Cl52a wow = new Cl52a(len, wid);

        wow.setStuff();

      //  int area = wow.getArea();
       // int perim = wow.getPerim();
      // out.println("Area: " + area);
      // out.println("Perimeter: " + perim);
      // out.println(wow);
       wow.print();
    }
}