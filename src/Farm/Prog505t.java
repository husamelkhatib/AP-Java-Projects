package Farm;

import java.io.*;
import java.util.*;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog505t.dat"));
            ArrayList<Horse> Horses = new ArrayList<Horse>();
            ArrayList<Cow> Cows = new ArrayList<Cow>();


            int hay = input.nextInt();
            double hayCOst = input.nextDouble();
            int corn = input.nextInt();
            double cornCost = input.nextDouble();

            int cowRows = input.nextInt();

            for (int r = 0; r < cowRows; r++) {

                int wight = input.nextInt();
                int milk = input.nextInt();
                int hayMunch = input.nextInt();
                int cornMunch = input.nextInt();
                Cow wow = new Cow(null, wight, milk, hayMunch, cornMunch);
                Cows.add(wow);
                hay -= hayMunch;
                corn -= cornMunch;
            }

            int horseRows = input.nextInt();

            for (int r = 0; r < horseRows; r++) {

                int wight = input.nextInt();
                int hayMunch = input.nextInt();
                int cornMunch = input.nextInt();
                int rides = input.nextInt();
                double ridesCost = input.nextDouble();
                Horse fred = new Horse( null, wight, rides, hayMunch, cornMunch, ridesCost);
                Horses.add(fred);
                hay -= hayMunch;
                corn -= cornMunch;
            }
            Farm farm = new Farm(Horses, Cows, hay, corn, hayCOst, cornCost);
            System.out.println("Income of the day: $" + farm.farmIncome());
            System.out.println("Cost of feeding animals: $" + farm.getCost());
            System.out.println("Weight of all animals: " + farm.getWeight());



            int eatHay = 0;
            int eatCOrn = 0;
            for(int lcv = 0; lcv < Cows.size(); lcv++) {
                eatHay += Cows.get(lcv).getNumHayBales();
                eatCOrn += Cows.get(lcv).getNumCorn();
            }
            for(int lcv = 0; lcv < Horses.size(); lcv++) {
                eatHay += Horses.get(lcv).getNumHayBales();
                eatCOrn += Horses.get(lcv).getNumCorn();
            }
            if(farm.feedAllAnimals()){
                System.out.println("Number of hay bales left over: " + (hay - eatHay));
                System.out.println("Number of corn cobs left over: " + (corn - eatCOrn));

            }else{
                System.out.println("There is insufficient food to feed all animals and we are request a shipment of: \n"
                        + (hay-eatHay) + "hay bales \n" + (corn-eatCOrn) + "cobs of corn");
            }

            for(int three = 0; three < 3; three++){
                int leastIndex = 0;
                for(int lcv = 1; lcv < Cows.size(); lcv++){
                    if(Cows.get(lcv).value(cornCost, hayCOst) < Cows.get(leastIndex).value(cornCost, hayCOst)){
                        leastIndex = lcv;
                    }
                }
                Cows.remove(leastIndex);
            }

            for(int two = 0; two < 4; two++){
                int leastIndex = 0;
                for(int lcv = 1; lcv < Horses.size(); lcv++){
                    if(Horses.get(lcv).value(cornCost, hayCOst) < Horses.get(leastIndex).value(cornCost, hayCOst)){
                        leastIndex = lcv;
                    }
                }
                Horses.remove(leastIndex);
            }


            Cows.set(0, new Cow ("patricia", 1250, 80, 3, 4));

            System.out.println("Total number of cows: " + Cows.size());
            System.out.println("Total number of horses: " + Horses.size());




        } catch (
                IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}