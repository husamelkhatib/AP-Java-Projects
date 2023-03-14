package Farm;
import java.util.*;
public class Farm implements Farm2{
    private ArrayList<Horse> myHorses;
    private ArrayList<Cow> myCows;
    private int myNumHayBales;
    private int myNumCorn;
    private double myHayCost;
    private double myCornCost;


    public Farm(ArrayList<Horse> horsies, ArrayList<Cow> cowwows, int numHay, int numCown, double hayCost, double cornCost){
        myHorses = horsies;
        myCows = cowwows;
        myNumHayBales = numHay;
        myNumCorn = numCown;
        myHayCost = hayCost;
        myCornCost = cornCost;

    }

    private boolean feedCows() {
        int eatHay = 0;
        int eatCOrn = 0;
        for(int lcv = 0; lcv < myCows.size(); lcv++) {
            eatHay += myCows.get(lcv).getNumHayBales();
            eatCOrn += myCows.get(lcv).getNumCorn();
        }
        if(myNumHayBales > eatHay && myNumCorn > eatCOrn)
            return true;
        return false;
    }


    private boolean feedHorses()  {
        int eatHay = 0;
        int eatCOrn = 0;
        for(int lcv = 0; lcv < myHorses.size(); lcv++) {
            eatHay += myHorses.get(lcv).getNumHayBales();
            eatCOrn += myHorses.get(lcv).getNumCorn();
        }
        if(myNumHayBales > eatHay && myNumCorn > eatCOrn)
            return true;
        return false; }


    public boolean feedAllAnimals(){
        int eatHay = 0;
        int eatCOrn = 0;
        for(int lcv = 0; lcv < myCows.size(); lcv++) {
            eatHay += myCows.get(lcv).getNumHayBales();
            eatCOrn += myCows.get(lcv).getNumCorn();
        }
        for(int lcv = 0; lcv < myHorses.size(); lcv++) {
            eatHay += myHorses.get(lcv).getNumHayBales();
            eatCOrn += myHorses.get(lcv).getNumCorn();
        }
        if(myNumHayBales > eatHay && myNumCorn > eatCOrn)
            return true;
        return false;
    }


    private double cowIncome(double perPound)  {
        int cowValue = 0;
        for(int lcv = 0; lcv < myCows.size(); lcv++){
            cowValue += (myCows.get(lcv).getMilk() * perPound);
        }
        return cowValue;
    }


    private double horseIncome() {
        int horseValue = 0;
        for(int lcv = 0; lcv < myHorses.size(); lcv++){
            horseValue += myHorses.get(lcv).getRides() * myHorses.get(lcv).getRideCost();
        }
        return horseValue;
    }


    public double farmIncome(){
        int farmValue = 0;
        for(int lcv = 0; lcv < myCows.size(); lcv++){
            farmValue += (myCows.get(lcv).getMilk() * myCows.get(lcv).getMilkPrice());
        }
        for(int lcv = 0; lcv < myHorses.size(); lcv++){
            farmValue += myHorses.get(lcv).getRides() * myHorses.get(lcv).getRideCost();
        }
        return farmValue;
    }


    public int getWeight(){
        int farmWight = 0;
        for(int lcv = 0; lcv< myCows.size(); lcv++){
            farmWight += myCows.get(lcv).getWeight();
        }
        for(int lcv = 0; lcv< myHorses.size(); lcv++){
            farmWight += myHorses.get(lcv).getWeight();
        }
        return farmWight;
    }


    public double getCost(){
        double aminalCost = 0;
        for(int lcv = 0; lcv < myCows.size(); lcv++){
            aminalCost+= myCows.get(lcv).getFeedCost(myHayCost, myCornCost);
        }
        for(int lcv = 0; lcv < myHorses.size(); lcv++){
            aminalCost+= myHorses.get(lcv).getFeedCost(myHayCost, myCornCost);
        }
        return aminalCost;
    }


    public ArrayList<Cow> getCows(){
        return myCows;
    }


    public ArrayList<Horse> getHorses(){
        return myHorses;
    }
}
