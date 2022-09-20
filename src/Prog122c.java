class Prog122c {
    public static void main(String[] args) {
        int number = 2;
        int numberOdd = 3;
        int numberMultiplied = 4;
        int numberFuncAdded = 4;


        while (number <= 10) {
            System.out.println(" " + number + "     " + numberOdd + "     " + numberMultiplied + "     " + numberFuncAdded);
            number += 2;
            numberMultiplied = number * 2;
            numberOdd += 2;
            numberFuncAdded = number * number;

        }
    }
}