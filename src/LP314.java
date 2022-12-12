import java.util.*;
public class LP314 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Awbrey Ny votes: ");
        int Avotes = input.nextInt();

        System.out.print("Enter M's Ny votes: ");
        int Mvotes = input.nextInt();

        System.out.print("Enter A's Nj votes: ");
        int Avotes2 = input.nextInt();

        System.out.print("Enter M's Nj votes: ");
        int Mvotes2 = input.nextInt();

        System.out.print("Enter A's C votes: ");
        int Avotes3 = input.nextInt();

        System.out.print("Enter M's C votes: ");
        int Mvotes3 = input.nextInt();

        LP314Class wow = new LP314Class(Avotes, Mvotes, Avotes2, Mvotes2, Avotes3, Mvotes3);
        wow.setStuff();

        int ATvotes = wow.getAvotes();

        int MTvotes = wow.getMvotes();

        int Tvotes = wow.getTvotes();

        double APMvotes = wow.getAPvotes();

        double MPVotes = wow.getMPvotes();

        System.out.println("Election results for Ny");
        System.out.println("Awbery: " + Avotes);
        System.out.println("Martinez: " + Mvotes);
        System.out.println();

        System.out.println("Election results for Nj");
        System.out.println("Awbery: " + Avotes2);
        System.out.println("Martinez: " + Mvotes2);
        System.out.println();

        System.out.println("Election results for c ");
        System.out.println("Awbery: " + Avotes3);
        System.out.println("Martinez: " + Mvotes3);
        System.out.println();

        System.out.println("\tCandidate\t\tVotes\t\tPercentage");
        System.out.println("Awbery: " + ATvotes + " " + APMvotes);
        System.out.println("Martinez: " + MTvotes + " " + MPVotes);
        System.out.println("The total is " + Tvotes);


    }
}