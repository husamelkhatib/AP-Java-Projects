import java.util.*;

class LP56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input
        System.out.println("Enter a positive integer");
        String numbers = input.nextLine();
        int sum = 0;

        //math
        for (int lcv = 0; lcv < numbers.length(); lcv ++) {
            String answer = numbers.substring(lcv, lcv + 1);
            int String = Integer.parseInt(answer);
            sum = String + sum;
        }

        //output
        System.out.println(sum);
    }
}