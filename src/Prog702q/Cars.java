package Prog702q;

public class Cars extends Vehicle {
    private double myValue;

    public Cars(String n, int t, double v) {
        super(n,t);
        myValue = v;
    }

    public double getValue() {return myValue;}
}