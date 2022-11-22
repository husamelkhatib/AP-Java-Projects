import java.util.*;
import java.io.*;
public class Prog213fClass {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner (new File("data/prog213f.dat"));
            Scanner num = new Scanner (new File("data/prog213f.dat"));
            while (input.hasNext() && input.nextInt() != 999) {
                int kwh = num.nextInt();
                Cl213f fred = new Cl213f(kwh);
                fred.calc();
                System.out.println(fred.toString());

            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
