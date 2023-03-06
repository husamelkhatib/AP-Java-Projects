import java.util.Scanner;

public class Prog910b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number base 10 to convert: ");
            int number = scanner.nextInt();
            System.out.print("Enter the new base: ");
            int base = scanner.nextInt();

            String result = convert(number, base);

            System.out.printf("The number %d [base 10] = %s [base %d]\n", number, result, base);

            System.out.print("Do you want to convert another number? (y/n) ");
            String answer = scanner.next();
            if (answer.equals("n")) {
                break;
            }
        }

        scanner.close();
    }

    public static String convert(int number, int base) {
        if (number == 0) {
            return "0";
        }

        String digits = "0123456789ABCDEF";
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int digit = number % base;
            result.insert(0, digits.charAt(digit));
            number /= base;
        }

        return result.toString();
    }
}
