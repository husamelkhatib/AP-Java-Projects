public class Cl54b {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int sum;

    public Cl54b() {
        num1 = 0;
        num2 = 0;
        num3 = 0;
        num4 = 0;
    }
    public Cl54b(int one, int two, int three, int four) {
        num1 = one;
        num2 = two;
        num3 = three;
        num4 = four;
    }
    public void setStuff() {
        sum = num1 + num2 + num3 + num4;
    }
    public int getSum() { return sum; }
}