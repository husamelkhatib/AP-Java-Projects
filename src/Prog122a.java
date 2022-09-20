class Prog122a {
    public static void main(String[] args) {
        int number = 0;
        int numberSquared = 0;
        double numberRoot = 0;
        System.out.println("Number" + "               " + "Square" + "               " + "Square root");
        while (number < 51) {
            numberRoot = Math.round(numberRoot * Math.pow(10, 4)) / Math.pow(10, 4);
            System.out.println(" " + number + "          " + numberSquared + "          " + numberRoot);
            number += 1;
            numberSquared = number * number;
            numberRoot = Math.sqrt(number);
        }
    }
}