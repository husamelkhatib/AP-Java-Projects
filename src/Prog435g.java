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

        } catch (IOException e){
            System.out.println("Cant find data file!");
        }
    }
}