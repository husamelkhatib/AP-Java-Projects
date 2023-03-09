public class Prog152aRecursive {
    public static void main(String[] args) {
        int sum = sumMultiplesOf3(3, 9669);
        System.out.println("The sum of the multiples of 3, from 3 to 9669 is " + sum);
    }

    private static int sumMultiplesOf3(int start, int end) {
        if (start > end) {
            return 0;
        }
        if (start % 3 == 0) {
            return start + sumMultiplesOf3(start + 3, end);
        } else {
            return sumMultiplesOf3(start + 1, end);
        }
    }
}
