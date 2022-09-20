public class Prog122h {
    public static void main(String[] args) {

        int lcv = 1;
        int square;
        double squareRoot;
        int cube;
        double fourthRoot;

        System.out.println("Number    Square    Square Root    Cube    Fourth Root");
        while (lcv <= 20) {

            square = (int)Math.pow(lcv,2);
            squareRoot = Math.sqrt(lcv);
            cube = (int)Math.pow(lcv,3);
            fourthRoot = Math.pow(lcv,0.25);

            System.out.println(lcv + "    " + square + "    " + squareRoot + "    " + cube + "    " + fourthRoot);

            lcv+=1;
        }
    }
}
