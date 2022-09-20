class Prog122b {
    public static void main(String[] args) {
        int number = 0;
        int numberMultiplied = 0;

        System.out.println("Number" + "        " + "Payed");
        while (number <= 40) {
            System.out.println(" " + number + "          " + numberMultiplied);
            number += 1;
            numberMultiplied = number * 4;

        }
    }
}