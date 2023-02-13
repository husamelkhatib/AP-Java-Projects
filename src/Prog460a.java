import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog460a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/sort.dat"));
            int[] list = new int[60];
            int count = 0;
            while (input.hasNext()) {
                list[count] = input.nextInt();
                count++;
            }
            Arrays.sort(list);

            Scanner kbd = new Scanner(System.in);
            int num = 0;
            while (num != -1) {
                System.out.print("\nEnter a number to search for: ");
                num = kbd.nextInt();
                int index = SearchAlgs.linearSearch(list, num);
                // int index = SearchAlgs.binarySearch(list, num);
                // int index = SearchAlgs.binarySearchRec(list, num, 0, list.length-1);
                if (index == -1)
                    System.out.println("Your number does not occur in this list");
                else
                    System.out.println("Your number occurs at position: " + (index+1));
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}