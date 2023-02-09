package Prog702q;

public class Trucks extends Vehicle {
    private double myValue;
    private double myMiles;

    public Trucks(String n, int t, double m) {
        super(n,t);
        myMiles = m;
        myValue = 50000 - (m * .25);
    }

    public double getValue() {return myValue;}
    public double getMiles() {return myMiles;}

}
