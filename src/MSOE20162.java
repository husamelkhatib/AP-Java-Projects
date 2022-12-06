import java.util.Scanner;
class MSOE20162 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Length of A: ");
        double a = in.nextDouble();
        System.out.println("Length of C: ");
        double c = in.nextDouble();
        System.out.println("The angle of A: ");
        double AA = in.nextDouble();

        double sina = Math.sin(Math.toRadians(AA));
        double AngleC = Math.asin(c * sina / a);
        AngleC = Math.ceil(Math.toDegrees(c));
        int b = 180 - (int) (AngleC);


        System.out.println( (int) AngleC + " " + AA + " " + b);
    }
}