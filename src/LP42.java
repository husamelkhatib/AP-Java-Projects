import java.util.*;
class LP42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much does it weigh?");
        int weight = input.nextInt();
        System.out.println("What is it's length in cm?");
        int length = input.nextInt();
        System.out.println("What is it's width in cm?");
        int width = input.nextInt();
        System.out.println("What is it's height in cm?");
        int height = input.nextInt();
        if (weight > 27 && (length < 101) && (width < 101) && (height < 101)) {
            System.out.println("Package is too heavy");
        } else if ((weight < 28) && ((length > 100) || (width > 100) || (height > 100))) {
            System.out.println("Package too large");
        } else if ((weight > 27) && ((length > 100) || (width > 100) || (height > 100))) {
            System.out.println("Package too heavy and too large");
        } else {
            System.out.println("Package is fine");

        }
    }
}