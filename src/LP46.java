import java.util.*;
class LP46 {
    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound = 11;
        int num1 = rand.nextInt(upperbound);
        int num2 = rand.nextInt(upperbound);
        int value = 0;
        char operator = '?';
        switch (rand.nextInt(4)){
            case 0: operator = '+';
                value = num1+num2;
                break;
            case 1: operator = '-';
                value = num1-num2;
                break;
            case 2: operator = '*';
                value = num1*num2;
                break;
            case 3: operator = '/';
                value = num1/num2;
                break;
            default: operator = '?';
        }
        System.out.println(num1 + " " + (operator) + " " + (num2) + " = ?");
        Scanner bored = new Scanner(System.in);
        System.out.println("What is the answer?");
        int answer = bored.nextInt();
        if (value == answer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}