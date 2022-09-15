import java.util.*;
class Prog76a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Name a number you dislike between 1 and 9 ");
        int dislike = keyboard.nextInt();
        dislike = dislike * 9 * 12345679;
        System.out.println("Surprise!!! " + dislike);

    }
}