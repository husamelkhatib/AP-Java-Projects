class LP514 {
    public static void main(String[] args) {
        int dice1 = 0;
        int dice2 = 0;
        int total = 0;
        System.out.println("Dice1\tDice2\tTotal");
        for (int c = 1; c <= 5; c++) {
            dice1 = (int)((Math.random() * 6) + 1);
            dice2 = (int)((Math.random() * 6) + 1);
            total = dice1 + dice2;
            System.out.println(dice1 + "\t\t" + dice2 + "\t\t" + total);
        }
    }
}