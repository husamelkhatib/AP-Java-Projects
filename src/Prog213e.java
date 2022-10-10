import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213e {
    public static void main(String []args) {
        try {
            Scanner input = new Scanner(new File("data/prog213e.dat"));
            double young = 0;
            double middleAged = 0;
            double gettingOld = 0;
            double old = 0;
            double gonnaDieSoon = 0;
            double counter = 0;
            while (input.hasNext()) {
                int ages = input.nextInt();
                counter++;
                if (ages < 20) {
                    young ++;
                } else if (ages < 40 && ages > 19) {
                    middleAged++;
                } else if (ages < 60 && ages > 39) {
                    gettingOld++;
                } else if (ages < 80 && ages > 59) {
                    old++;
                } else {
                    gonnaDieSoon++;
                }
            }

            double percentYoung = young / counter;
            double percentMiddleAged = middleAged / counter;
            double percentGettingOld = gettingOld / counter;
            double percentOld = old / counter;
            double percentGonnaDieSoon = gonnaDieSoon / counter;

            System.out.println("Age Group\tDistribution\tPercentage");
            System.out.printf("<20\t%d\t%.2f\n", (int) young, percentYoung);
            System.out.printf("20-39\t%d\t%.2f\n", (int) percentMiddleAged);
            System.out.printf("40-59\t%d", gettingOld, "\t%.2f\n", percentGettingOld);
            System.out.printf("60-79\t%d", old, "\t%.2f\n", percentOld);
            System.out.printf(">79\t%d", gonnaDieSoon, "\t%.2f\n", percentGonnaDieSoon);
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
