public class Prog122i {
    public static void main(String[] args) {

        int lcv = -25;
        double cube_root;
        int cube;

        while (lcv <= 25) {

            cube = (int) Math.pow(lcv, 3);
            cube_root = Math.cbrt(cube);

            System.out.println(lcv + "   " + cube + "  " + cube_root);

            lcv += 1;
        }
    }
}