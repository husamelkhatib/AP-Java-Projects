public class Cl213f {
    private double myKwh;
    private double myCost;

    public Cl213f(double kwh) {
        myKwh = kwh;
        myCost = 0;
    }

    public void calc() {
        for (int lcv = 1; lcv <= myKwh; lcv++) {
            if (lcv <= 2000)
                myCost += 0.07;
            else if (lcv <= 10000)
                myCost += 0.05;
            else
                myCost += 0.04;
        }
    }

    public String toString() {
        return "The number of " + myKwh + "is $ " + myCost;
    }
}