import java.util.Locale;
import java.util.Scanner;
public class StrInterview7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String mytext = keyboard.nextLine();
        mytext = mytext.toLowerCase();
        int vowelCount = 0;
        for (int lcv = 0; lcv < mytext.length(); lcv ++) {
            char current = mytext.charAt(lcv);
            if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u') vowelCount++;
        }
            int consCount = mytext.length() - vowelCount;
                System.out.printf("# Vowels: %d\t\t# Consonants: %d\n", vowelCount, consCount);

    }
}
