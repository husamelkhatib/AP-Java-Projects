import java.util.*;

class LP416 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the angle in degrees?");
        double angle = input.nextDouble();
        angle = Math.toRadians(angle);
        double sin = Math.sin(angle);
        double cosine = Math.cos(angle);
        double tangent = Math.tan(angle);
        System.out.printf("Sin: %.3f\n", sin);
        System.out.printf("Cosine: %.3f\n", cosine);
        System.out.printf("Tangent: %.3f\n", tangent);

    }
}
