import java.io.File;
import java.io.IOException;
import java.util.*;
public class Prog410t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/survey2.dat"));
            ArrayList<Integer> id = new ArrayList<Integer>();
            ArrayList<Integer> sal = new ArrayList<Integer>();
            ArrayList<Integer> members = new ArrayList<Integer>();


            for (int lcv = 0; lcv < 26; lcv++) {
                while (input.hasNext()) {
                    id.add(input.nextInt());
                    sal.add(input.nextInt());
                    members.add(input.nextInt());
                }
            }
            System.out.print("id\t\tincome\t\tmembers");
            for (int lcv = 0; lcv < id.size(); lcv++) {
                System.out.printf("\n%d\t%d\t\t%d", id.get(lcv), sal.get(lcv), members.get(lcv));
            }
            double income = 0;
            for (int x : sal) {
                income += x;
            }
            income /= sal.size();
            System.out.printf("\nHouseholds with income exceeding the income of %.2f: ", income);
            for (int lcv = 0; lcv < sal.size(); lcv++) {
                if (sal.get(lcv) > income) {
                    System.out.printf("\n%d\t%d\t\t%d", id.get(lcv), sal.get(lcv), members.get(lcv));
                }
            }
            int per = 0;
            for (int lcv = 0; lcv < id.size(); lcv++) {
                if (3750.00 + 750.00 * (members.get(lcv) - 2) > sal.get(lcv)) {
                    per++;
                }
            }
            System.out.println("\nPercent of households below poverty level " + per / sal.size() + "%");

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}