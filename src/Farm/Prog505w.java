package Farm;

import java.io.*;
import java.util.*;

public class Prog505w {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog505w.dat"));
            List<Animal> animals = new ArrayList<Animal>();

            int hay = input.nextInt();
            double hayCOst = input.nextDouble();
            int corn = input.nextInt();
            double cornCost = input.nextDouble();

            int cowRows = input.nextInt();
            int cowPens = input.nextInt();

            for(int r = 0; r < cowRows; r++){
                for(int p = 0; p < cowPens; p++){
                    String name = input.next();
                    int wight = input.nextInt();
                    int milk = input.nextInt();
                    int hayMunch = input.nextInt();
                    int cornMunch = input.nextInt();
                    Cow wow = new Cow (name, wight, milk, hayMunch, cornMunch);
                    animals.add(wow);
                    hay-= hayMunch;
                    corn -= cornMunch;
                }
            }

            int horseRows = input.nextInt();
            int horsePens = input.nextInt();

            for(int r = 0; r < horseRows; r++){
                for(int p = 0; p < horsePens; p++){
                    String name = input.next();
                    int wight = input.nextInt();
                    int hayMunch = input.nextInt();
                    int cornMunch = input.nextInt();
                    int rides = input.nextInt();
                    double ridesCost = input.nextDouble();
                    Horse fred = new Horse (name, wight, rides, hayMunch, cornMunch, ridesCost);
                    animals.add(fred);
                    hay-= hayMunch;
                    corn -= cornMunch;
                }
            }

            double minHorse = Double.MAX_VALUE;
            int minHorseIndex = 0;
            for(int lcv = 0; lcv < animals.size(); lcv++){
                if(animals.get(lcv) instanceof Horse){
                    Horse horse = (Horse)animals.get(lcv);
                    if(horse.value(cornCost, hayCOst) < minHorse){
                        minHorse = horse.value(cornCost, hayCOst);
                        minHorseIndex = lcv;
                    }
                }

            }

            System.out.printf("Horse %s makes the least money\n", animals.get(minHorseIndex).getName());
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}