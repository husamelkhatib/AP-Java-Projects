import java.util.*;
class LP49 {
    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound = 21;
        int Secret = rand.nextInt(upperbound);
        Scanner input = new Scanner(System.in);
        System.out.println("What is your guess for the secret number?");
        int guess = input.nextInt();
        if (Secret == guess) {
            System.out.println("NICE GUESS!!");
        } else {
            System.out.println("better luck next time :)");
        }
        System.out.println("The secret number was: " + Secret);
        System.out.println("Your guess was: " + guess);

    }
}