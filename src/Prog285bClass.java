import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog285bClass {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/Prog285b.dat"));
while (input.hasNext()) {
    int id = input.nextInt();
    int c = input.nextInt();
    double s = input.nextDouble();
    Salesperson fred = new Salesperson(id, c, s);
    fred.setComm();
    System.out.println(fred.toString());
}
        } catch (IOException e){
            System.out.println("Cant find data file!");
        }
    }
}

