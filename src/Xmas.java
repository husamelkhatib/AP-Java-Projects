public class Xmas {
    public static void main(String[] args) {
        System.out.println("\n\n");
        int branches = 16;
        int num = 1;
        String[] types = {".", ".", ".", ".", "~", "~", "~", "~", "'", "'", "'", "'", "0"};
        for (int r = branches + 1; r >= 1; r--) {
            if (num == 1) {
                for (int c = 0; c < r; c++)
                    System.out.print(" ");
                System.out.print("*\n");
                num += 2;
            } else {
                for (int x = 0; x < r; x++)
                    System.out.print(" ");
                for (int y = 0; y < num; y++) {
                    int index = (int) (Math.random() * types.length);
                    System.out.print(types[index]);

                }
                System.out.print("\n");
                num += 2;
            }
        }
        for (int x = 0; x < branches + 1; x++)
            System.out.print(" ");
        System.out.print("|\n");
        for (int x = 0; x < branches + 1; x++)
            System.out.print(" ");
        System.out.print("|\n\nHappy holidays from Java");
    }
}
