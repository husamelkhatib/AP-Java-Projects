public class transactions {
    private String myType;
    private double myAmount;

    public transactions(String type, double amount) {
        myType = type;
        myAmount = amount;
    }

    public String getCode() { return myType; }
    public double getAmount() { return myAmount; }
}