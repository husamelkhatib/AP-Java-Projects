public class Cl88a {
   private int num1;
    private int num2;
    private int sum;
    private int dif;
    private  int prod;
    private  int avg;
    private  int abb;
    private  int max;
    private  int min;

    public Cl88a(int myNum1, int myNum2) {
num1 = myNum1;
num2 = myNum2;
        sum = num1 + num2;
        dif = num1 - num2;
        prod = num1 * num2;
        avg = sum / 2;
        abb = Math.abs(dif);
        max = 0;
        min = 0;
    }

    public void setStuff() {
        if (num1 > num2){
            max = num1;

        }else{
            max = num2;

        }
        if (max == num1){
            min = num2;

        } else {
            min = num1;
        }
    }

    public int getSum() { return sum; }
    public int getDif() { return dif; }
    public int getProd() { return prod; }
    public int getAvg() { return avg; }
    public int getAbb() { return abb; }
    public int getMax() { return max; }
    public int getMin() { return min; }

}