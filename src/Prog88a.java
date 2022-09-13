public class Prog88a {
    public static void main(String args[]) {
        int num1 = (int)Math.random() * (13 - 1) + 1;
        int num2 = (int)Math.random() * (20 - 2) + 2;
        int sum = num1 + num2;
        int dif = num1 - num2;
        int prod = num1 * num2;
                int avg = sum / 2;
                int abb = Math.abs(dif);
                int max;
                int min;
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
                System.out.println("Sum = " + sum);
        System.out.println("Difference = " + dif);
        System.out.println("Product = " + prod);
        System.out.println("Average = " + avg);
        System.out.println("Absolute Value = " + abb);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
