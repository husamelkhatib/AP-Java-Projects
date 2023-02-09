package Prog702pExtra;

import java.util.*;
import java.io.*;


public class Prog702p {
    public static void main(String[] args) {
        try {  // on replit, may need to put "../data ..etc
            Scanner input = new Scanner(new File("data/prog701g.dat"));
            List<Animal> list = new ArrayList<Animal>();

            int num = input.nextInt();
            while (num != 99) {
                String f = input.next();
                String l = input.next();

                if (num == 1) {
                    double fur = input.nextDouble();
                    Animal p = new Hicca(f,l,fur);
                    list.add(p);
                } else if (num == 2) {
                    double s = input.nextDouble();
                    Animal p = new Wallies(f,l,s);
                    list.add(p);
                } else if (num == 3) {
                    String w = input.next();
                    Animal p = new Beeper(f,l,w);
                    list.add(p);
                }
                num = input.nextInt();
            }


            int cnt1 = 0;
            int cnt2 = 0;
            int cnt3 = 0;
            double totSteps = 0;
            double totFur = 0;
            double totSize = 0;


            for (Animal x : list) {
                if (x instanceof Hicca) {
                    totFur += ((Hicca)x).getFur();
                    cnt1++;
                }
                if (x instanceof Wallies) {
                    totSteps += ((Wallies)x).getSteps();
                    cnt2++;
                }
                if (x instanceof Beeper) {
                    totSize = ((Beeper)x).getWord().length();
                    cnt3++;
                }
            }

            System.out.println("Average value of hicca fur: " + String.format("%.2f", (totFur/cnt1)));
            System.out.println("Average number of steps taken by the wallies " + String.format("%.2f", (totSteps/cnt2)));
            System.out.println("Average size of the beepers words " + String.format("%.2f", (totSize/cnt3)));




        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
