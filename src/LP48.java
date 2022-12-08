import java.util.*;

public class LP48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is a?");
        int a = input.nextInt();
        System.out.println("What is c?");
        int c = input.nextInt();
        System.out.println("What is m?");
        int m = input.nextInt();
        System.out.println("What is the seed?");
        int X0 = input.nextInt();
        CLLP48 bruh = new CLLP48(a,c,m,X0);
        for (int lcv = 0; lcv < 10; lcv++) {
            System.out.println(bruh.toString());
        }

    }
}