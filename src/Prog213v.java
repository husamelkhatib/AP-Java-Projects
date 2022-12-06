import java.io.*;
import java.util.*;

public class Prog213v {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog213v.dat"));
            ArrayList<transactions> list = new ArrayList<transactions>();

            double balance = input.nextDouble();
            Bank wow = new Bank(balance);

            String code = input.next();
            while (!(code.equals("E"))) {
                double amount = input.nextDouble();
                transactions fred = new transactions(code, amount);
                list.add(fred);
                code = input.next();
            }

            for (int lcv = 0; lcv < list.size(); lcv++)
                wow.calc(list.get(lcv));

            System.out.println("The final balance is: $" + wow.getAmount());
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}