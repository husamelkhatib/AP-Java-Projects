import java.util.*;
class LP55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        String numbers = input.nextLine();
        int lcv = 0;
        while (lcv < numbers.length()) {

            System.out.println(numbers.substring(lcv, lcv + 1));
            lcv ++;
        }

    }
}