import java.io.*;
import java.util.*;

public class prog602b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog602b.dat"));
            ArrayList<InternetCustomer> list = new ArrayList<InternetCustomer>();

            while (input.hasNext()) {
                int id = input.nextInt();
                double hours = input.nextDouble();
                int code = input.nextInt();

                InternetCustomer fred = new InternetCustomer(id, hours, code);
                list.add(fred);
            }

            for (int lcv = 0; lcv < list.size(); lcv++) {
                InternetCustomer me = list.get(lcv);
                me.setCharge();
            }

            System.out.println("Account #\t\tHours\t\tCode\t\tAmount Due");
            for (InternetCustomer me : list) {
                System.out.println(me.getAcc() + "\t\t" +
                        me.getHours() + "\t\t" + me.getCode() + "\t\t" + me.getCharge());
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}