package Prog702p;

public class Wallies extends Animal {
    private double mySteps;

    public Wallies(String f, String l, double steps) {
        super(f,l);
        mySteps = steps;
    }

    public double getSteps() {return mySteps;}

}
