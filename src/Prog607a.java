import java.util.Scanner;

public class Prog607a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println("-----Menu-----");
            System.out.println("0) Quit");
            System.out.println("1) Encode Date");
            System.out.println("2) Decode Date");
            System.out.print("Select an option: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter date (m/d/y): ");
                    String date = input.next();
                    System.out.println("The code is: " + encodeDate(date));
                    break;
                case 2:
                    System.out.print("Enter code: ");
                    String code = input.next();
                    System.out.println("The date is: " + decodeDate(code));
                    break;
            }
        } while (option != 0);
    }

    public static String encodeDate(String date) {
        String[] parts = date.split("/");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]) - 1970;

        String monthCode = (char)('A' + month - 1) + "";
        String dayCode = (char)('Q' + (day / 10)) + "" + (char)('Q' + (day % 10));
        String yearCode = (char)('Z' - year) + "";

        return monthCode + dayCode + yearCode;
    }

    public static String decodeDate(String code) {
        int month = code.charAt(0) - 'A' + 1;
        int day = (code.charAt(1) - 'Q') * 10 + (code.charAt(2) - 'Q');
        int year = 'Z' - code.charAt(3) + 1970;

        return month + "/" + day + "/" + year;
    }
}
