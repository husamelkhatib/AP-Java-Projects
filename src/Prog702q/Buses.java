package Prog702q;

public class Buses extends Vehicle{
    private String myHome;
    private double myValue;

    public Buses(String n, int t, String h) {
        super(n,t);
        myHome = h;
        myValue = 50000;
    }

    public String getHome() {return myHome;}
    public double getValue() {return myValue;}



}