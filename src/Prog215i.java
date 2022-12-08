import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog215i {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/Prog215i.dat"));

            Scanner scanner = new Scanner(System.in);
            int numv = 0;
            int tMpg = 0;
            int bestMpg = Integer.MIN_VALUE;
            int worstMpg = Integer.MAX_VALUE;
            String bestmv = "";
            String worstmv = "";


            System.out.println("Enter vehicle :");
            int vnum = scanner.nextInt();
            while (vnum != 0) {
                int gallons = scanner.nextInt();
                int miles = scanner.nextInt();

                if (miles > 0 && gallons > 0) {
                    int mpg = miles / gallons;
                    tMpg += mpg;
                    numv++;
                    if (mpg > bestMpg) {
                        bestMpg = mpg;
                        bestmv = String.valueOf(vnum);
                    }
                    if (mpg < worstMpg) {
                        worstMpg = mpg;
                        worstmv = String.valueOf(vnum);
                    }


                    System.out.println("Vehicle " + vnum + ": " + gallons + " gallons, " + miles + " miles, " + mpg + " mpg");
                }
                vnum = scanner.nextInt();
            }
            double averageMpg = (double) tMpg / numv;
            System.out.println("\nNumber of vehicles processed: " + numv);
            System.out.println("Best MPG: Vehicle " + bestmv + " (" + bestMpg + " mpg)");
            System.out.println("Worst MPG: Vehicle " + worstmv + " (" + worstMpg + " mpg)");
            System.out.println("Average MPG: " + averageMpg);
        } catch (
                IOException e) {
            System.out.println("Cant find data file");
        }
    }
}