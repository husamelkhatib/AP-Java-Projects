public class Prog166f {
    public static void main(String[] args) {

        int lcv = 1;
        int upperbound = 100;
        int bigsum = 0;

        while (upperbound <= 110) {

            bigsum += lcv;

            if (lcv == upperbound) {

                System.out.println("The sum of the numbers from 1 to " + upperbound + " is " + bigsum);
                bigsum = 0;
                lcv = 1;
                upperbound += 1;
            }

            lcv += 1;
        }
    }
}

