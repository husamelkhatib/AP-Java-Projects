package Prog702p;

public class Hicca extends Animal {
    private double myFur;

    public Hicca(String f, String l, double fur) {
        super(f,l);
        myFur = fur;
    }

    public double getFur() {return myFur;}
}
