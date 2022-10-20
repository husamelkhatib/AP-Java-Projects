public class Cl82a {
    private double myTicketCost;
    private int mySpeedDriving;
    private int mySpeedLimit;



    public Cl82a(int speedDriving, int speedLimit) {
        myTicketCost = 0;
        mySpeedDriving = speedDriving;
        mySpeedLimit = speedLimit;
    }
    public void setStuff() {
        myTicketCost = 20 + (mySpeedDriving - mySpeedLimit) * 5;
    }
    public double getTicketCost() { return myTicketCost; }
}