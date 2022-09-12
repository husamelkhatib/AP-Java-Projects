import java.util.Scanner;

public class Prog52aInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length: ");
        int len = input.nextInt();
        System.out.println();
        System.out.println("Please enter the width: ");
        int wid = input.nextInt();
        System.out.println();
        int area = len * wid;
        int perimeter = 2 * len + 2 * wid;
        System.out.println("The area is: " + area);
        System.out.println("the perimeter is: " + perimeter);
    }
}
/*
please enter the length of 5

please enter the width of 10
 */