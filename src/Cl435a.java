public class Cl435a {
    private double myfactor;
    private String mytype;
    private int mygate;
    private double mytoll;
    private double mycost;


    public Cl435a(double factor, int gate) {
        myfactor = factor;
        mygate = gate;
        mytoll = 0;
        mycost = 0;
        mytype = "";
    }

    public void calc() {
        if (myfactor == 1.0) { mytype = "Compact Car";}
        else if (myfactor == 1.3) { mytype = "Small Car";}
        else if (myfactor == 1.6) {mytype = "Mid Size Car";}
        else if (myfactor == 2.0) {mytype = "Full Size Car";}
        else if (myfactor == 2.4) {mytype = "Truck";}
        else if (myfactor == 2.7) {mytype = "16 Wheeler";}


    }
}