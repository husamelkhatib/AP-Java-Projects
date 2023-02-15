package Prog703s;

import java.util.*;
import java.io.*;

public class Prog703s {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog703s.dat"));
            List<comps> list = new ArrayList<comps>();

            int num = input.nextInt();
            while (num != 99) {
                String n = input.next();
                int number = input.nextInt();
                double v = input.nextDouble();

                if (num == 1) {
                    String col = input.next();
                    comps p = new Apple(n, number, col);
                    list.add(p);
                } else if (num == 2) {
                    double ver = input.nextDouble();
                    comps p = new Windows(n,number,v,ver);
                    list.add(p);
                } else if (num == 3) {
                    int c = input.nextInt();
                    comps p = new Linux(n,number,v,c);
                    list.add(p);
                }
                num = input.nextInt();
            }

            int gcolor = 0;
            int version7 = 0;
            int end5 = 0;

            for (comps x : list) {
                if (x instanceof Apple) {
                    String color = ((Apple)x).getColor();
                    if (color.equals("Green") || color.equals("Gold"))
                        gcolor++;
                }
                if (x instanceof Windows) {
                    double version = ((Windows)x).getVersion();
                    if (version == 7)
                        version7++;
                }
                if (x instanceof Linux) {
                    int code = ((Linux)x).getCode();
                    if (code % 10 == 5)
                        end5++;
                }
            }

            System.out.println("Number of Apple computers that are Green or Gold: " + gcolor);
            System.out.println("Number of Windows machines on version 7.0: " + version7);
            System.out.println("Number of Linux machines with secret code ending in 5: " + end5);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
