
public class Cl214b {
    // integer ID,  decimal ytd pay, decimal base pay, decimal shift code and decimal hours worked.
    private int myID;
    private double myytdPay;
    private double mybasepay;
    private double myshiftCode;
    private double myhrsworked;
    private double mygrosspay;
    private double mywholding;
    private double myFICA;
    private double mynetpay;
    private double mytaxrate;

    public Cl214b(int ID, double ytdpay, double basepay, double shiftCode, double hrsworked) {
        myID = ID;
        myytdPay = ytdpay;
        mybasepay = basepay;
        myshiftCode = shiftCode;
        myhrsworked = hrsworked;
        mygrosspay = 0;
        mywholding = 0;
        myFICA = 0;
        mynetpay = 0;
        mytaxrate = 0;
    }

    //The gross pay is found by multiplying the hours worked by the pay rate where
//the pay rate is the product of the base pay rate and the shift factor.
    public void calc() {
        double tax = 0;

        mytaxrate = mybasepay * myshiftCode;

        mygrosspay = myhrsworked * (mybasepay * myshiftCode);

        if (mygrosspay < 100.00)
            tax = 0.0;
        else if (mygrosspay >= 100.0 && mygrosspay < 150.0) {
            tax = 0.08;
        } else if (mygrosspay >= 150.0 && mygrosspay < 200.0) {
            tax = 0.120;
        } else if (mygrosspay >= 200.0 && mygrosspay < 300.0) {
            tax = 0.150;
        } else {
            tax = 0.175;
        }

        mywholding = mygrosspay * tax;

        double totpay = myytdPay + mygrosspay;
        if (myytdPay > 17300) {
            myFICA = 0;
        } else if ((totpay) <= 17300) {
            myFICA = 0.0605 * mygrosspay;
        } else if ((myytdPay < 17300) && (totpay > 17300)) {
            myFICA = 0.0605 * (totpay - 17300);
        }
        mynetpay = mygrosspay - mywholding - myFICA;
    }

    public double getMygrosspay() {
        return mygrosspay;
    }

    public double getMyFICA() {
        return myFICA;
    }

    public double getMynetpay() {
        return mynetpay;
    }

    public double getMywholding() {
        return mywholding;
    }

    public double getMytaxrate() {
        return mytaxrate;
    }

    public double getMyytdPay() {
        return myytdPay;
    }

    public double getMyID() {
        return myID;
    }

    public double getMyHoursWorked() {
        return myhrsworked;
    }

    public double getMyNetPay() {
        return mynetpay;
    }

    public double getMyShiftFactor() {
        return myshiftCode;
    }
}