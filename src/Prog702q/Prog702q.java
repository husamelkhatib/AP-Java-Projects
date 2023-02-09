package Prog702q;

import java.util.*;
import java.io.*;

public class Prog702q {
    public static void main(String[] args) {
        try {  // on replit, may need to put "../data ..etc
            Scanner input = new Scanner(new File("data/prog702q.dat"));
            List<Vehicle> list = new ArrayList<Vehicle>();

            int num = input.nextInt();
            while (num != 99) {
                String n = input.next();
                int t = input.nextInt();

                if (num == 1) {
                    double v = input.nextDouble();
                    Vehicle p = new Cars(n, t, v);
                    list.add(p);
                } else if (num == 2) {
                    double m = input.nextDouble();
                    Vehicle p = new Trucks(n, t, m);
                    list.add(p);
                } else if (num == 3) {
                    String h = input.next();
                    Vehicle p = new Buses(n, t, h);
                    list.add(p);
                }
                num = input.nextInt();
            }
            int tot = 0;
            double cworth = 0;
            double vworth = 0;
            double tworth = 0;
            String longest = "";
            double least = 1000000000;
            int ttotc = 0;
            int ttott = 0;
            int ttotb = 0;

            for (Vehicle x : list) {
                if (x instanceof Cars) {
                    cworth += ((Cars)x).getValue();
                    tot++;
                    ttotc += ((Cars)x).getTire();
                    vworth += cworth;
                }
                if (x instanceof Trucks) {
                    tworth += ((Trucks)x).getValue();
                    if (tworth < least)
                        least = tworth;
                    tot++;
                    ttott += ((Trucks)x).getTire();
                    vworth += tworth;
                }
                if (x instanceof Buses) {
                    String xstring = ((Buses)x).getHome();
                    if (xstring.length() > longest.length())
                        longest = xstring;
                    ttotb = ((Buses)x).getTire();
                    vworth += ((Buses)x).getValue();

                    tot++;
                }
            }

            System.out.println("The total number of vehicles is: " + tot);
            System.out.println("The total worth of the cars is: " + cworth);
            System.out.println("The total worth of the vehicles is: " + vworth);
            System.out.println("The longest home destinaton name is: " + longest);
            System.out.println("The truck with the least value is: " + least);
            System.out.println("The total number of tires is: " + (ttotc + ttotb + ttott));










        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
