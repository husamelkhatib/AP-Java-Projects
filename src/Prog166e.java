class Prog166e {
    public static void main(String[] args) {
        int divisor1 = 0;
        int divisor2 = 0;
        double divisorAnswer = 0;

        while (divisor2 <= divisor1) {
            divisor2 += 1;
            divisor1 = 0;
            while (divisor1 < divisor2 & divisor2 < 16) {
                divisor1 +=1;
                divisorAnswer = (double) divisor1 / (double) divisor2;
                divisorAnswer = Math.round(divisorAnswer * Math.pow(10, 4)) / Math.pow(10, 4);
                System.out.println (divisor1 + "/" + divisor2 + "   " +  divisorAnswer);
            }
        }
    }
}
