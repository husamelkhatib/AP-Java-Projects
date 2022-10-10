import java.util.*;
class LP517 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like your password to be?");
        String password = input.nextLine();
        for (int c = 0; c < 3; c++) {
            System.out.println("What is the password?");
            String guess = input.nextLine();
            if (guess.equals(password)) {
                System.out.println("Welcome");
                c = 4;
            } else {
                System.out.println("Incorrect");
                if (c == 2) {
                    System.out.println("Access Denied");
                }
            }
        }
    }
}