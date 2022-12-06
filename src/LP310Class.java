public class LP310Class {
    private double burger;
    private double frys;
    private double sodas;
    private double tax;
    private double moneyBack;
    private double afterTax;
    private double MORETAX;

    private double tendered;

    private double change;

    public LP310Class(double numBurger, double numFrys, double numSodas, double tenderedd) {
        burger = numBurger;
        frys = numFrys;
        sodas = numSodas;
        tendered = tenderedd;
        tax = .065;
        moneyBack = 0;
        afterTax = 0;
        MORETAX = 0;
        change = 0;
    }

    public void YES() {
        burger = burger * 1.69;
        frys = frys * 1.09;
        sodas = sodas * 0.99;
        moneyBack = burger + frys + sodas;
        moneyBack = Math.round(moneyBack * 100) / 100;
        afterTax = moneyBack + (moneyBack * tax);
        afterTax = Math.round(afterTax * 100) / 100;
        MORETAX = afterTax - moneyBack;
        MORETAX = Math.round(MORETAX * 100) / 100;

        change = 20 - afterTax;
    }

    public double getMoneyBack() { return moneyBack; }
    public double getChange() { return change; }
    public double getMORETAX() { return MORETAX; }
    public double getAfterTax() { return afterTax; }
}