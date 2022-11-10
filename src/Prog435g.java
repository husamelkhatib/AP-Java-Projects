import java.util.*;
import java.io.*;

public class Prog435g {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File ("data/Prog435g.dat"));
                int[] scores = new int[100];
                int count = 0;
                while (input.hasNext()) {
                    int score = input.nextInt();
                    scores[count] = score;
                    count++;
                }
// Sort the Scores
            for (int lcv = 0; lcv < count; lcv ++) {
                for (int lcv2 = 0; lcv2 < count - 1; lcv2++) {
                    if (scores[lcv2] > scores[lcv2 + 1]) {
                        int temp = scores[lcv2];
                        scores[lcv2] = scores[lcv2 + 1];
                        scores[lcv2 + 1] = temp;
                    }
                }
            }
            Cl435g[] golfers = new Cl435g[count];
                for (int lcv = 0; lcv < count; lcv++) {
                    Cl435g myguy = new Cl435g(scores[lcv]);
                    golfers[lcv] = myguy;

                }
                int rank = 1;
                for (int lcv = 0; lcv < count; lcv++) {
                    golfers[lcv].setRank(rank);
                    if (lcv < count && scores[lcv] != scores[lcv + 1])
                        rank ++;
                }
                System.out.println("Scores\t\tRank");
                for (int lcv = 0; lcv < count; lcv++) {
                    System.out.println(golfers[lcv].toString());
                }
        } catch (IOException e){
            System.out.println("Cant find data file!");
        }
    }
}