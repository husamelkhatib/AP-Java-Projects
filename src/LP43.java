import java.util.*;
class LP43 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many eggs? ");
        int eggs = keyboard.nextInt();
        double cost = 0;
        double costPerEgg = 0;
        if (eggs <= 0) {
            System.out.println("How many eggs do you actually want");
            eggs = keyboard.nextInt();
        }  else if ((eggs > 0) && (eggs < 48)) {
            costPerEgg = 0.5;
        } else if ((eggs > 47) && (eggs < 72)) {
            costPerEgg = 0.45;
        } else if ((eggs > 71) && (eggs < 132)){
            costPerEgg = 0.4;
        }  else {
            costPerEgg = 0.35;
        }

        cost = eggs * costPerEgg;
        cost = cost / 12;
        cost = Math.round(cost * Math.pow(10, 2)) / Math.pow(10, 2);
        System.out.println("Your total is: $" + cost);
    }
}