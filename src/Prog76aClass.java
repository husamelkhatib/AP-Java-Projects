import java.util.Scanner;

public class Prog76aClass {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Name a number you dislike between 1 and 9");
        int myDislike = keyboard.nextInt();

        Cl76a wow = new Cl76a(myDislike);

        wow.setStuff();

        int dislike = wow.getDislike();


        System.out.println("Surprise!!! " + dislike);

    }
}