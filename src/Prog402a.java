import java.util.Scanner;
import java.io.*;

public class Prog402a {
    public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
        try {
            input = new Scanner(new File("data/prg402a.dat"));
            int[] id = new int[21];
            double[] score = new double[21];

            for(int i = 0; i < id.length; i++) {
                id[i] = input.nextInt();
                score[i] = input.nextDouble();
            }

            double sum = 0;

            for(int i = 0; i < score.length; i++) {
                sum += score[i];
            }

            double doubSum = sum;
            double average = doubSum/21;
            double[] diff = new double[21];
            for (int i = 0; i < score.length;i++){
                diff[i] = score[i] - average;
            }
            System.out.println("ID\t\tScore\t\tDifference");
            for(int i = 0; i < id.length; i++) {
                System.out.println(id[i] + "\t\t" + score[i] + "\t\t" + String.format("%.2f", diff[i]));
            }

        }
        catch (IOException e) {
            System.out.println("Can't find data file");

        }



    }
}