import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog214b.dat"));
            Cl214b[] list = new Cl214b[100];
            int size = 0;
            while (input.hasNext()){
                int ID = input.nextInt();
                double ytdpay = input.nextDouble();
                double basepay = input.nextDouble();
                double shiftCode = input.nextDouble();
                double hrsworked = input.nextDouble();
                Cl214b person = new Cl214b(ID, ytdpay,basepay, shiftCode, hrsworked);
                list[size] = person;
                size++;
            }
            for (int index = 0; index < size; index++) {
                list[index].calc();
            }
            for (int index = 0; index < size; index++) {
                Cl214b cur = list[index];
                System.out.println("Employee number: " + cur.getMyID());
                System.out.println("Hours: " + cur.getMyHoursWorked()  + "\t Rate:" + cur.getMytaxrate() + "\t Shift Factor"
                        + cur.getMyShiftFactor());
                System.out.println("\t\t Current \t\t Year-To-Date");
                System.out.println("Gross pay: \t" + cur.getMygrosspay() + "\t" + cur.getMyytdPay());
                System.out.println("Withholding: " + cur.getMywholding());
                System.out.println("FICA: " + cur.getMyFICA());
                System.out.println("Net Pay: " + cur.getMyNetPay());
                System.out.println("");
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
