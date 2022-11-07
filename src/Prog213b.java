import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213b {
    public static void main(String []args) {
        try {
            Scanner input = new Scanner(new File("data/prog215a.dat"));
   Cl213b[] list = new Cl213b[1000];
   int cnt = 0;

   while (input.hasNext()) {
       int quantity = input.nextInt();
Cl213b coolbeans = new Cl213b(quantity);
list[cnt] = coolbeans;
cnt++;
   }

   for (int lcv = 0; lcv < cnt; lcv++)
       list[lcv].calc();

   for (int lcv = 0; lcv < cnt; lcv++)
       System.out.println(list[lcv].toString());

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
