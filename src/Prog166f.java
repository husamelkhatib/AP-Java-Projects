public class Prog166f {
    public static void main(String[] args) {

        int LCV = 1;
        int upperBound = 100;
        int bigSum = 0;

        while (upperBound <= 110) {

            bigSum += LCV;

            if (LCV == upperBound) {

                System.out.println("The sum of the numbers from 1 to " + upperBound + " is " + bigSum);
                bigSum = 0;
                LCV = 1;
                upperBound += 1;
            }

            LCV += 1;
        }
    }
}

