import java.util.*;
class LP410 {
    public static void main(String[] args) {
        System.out.println("Rectangular Prism");
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length: ");
        int length = input.nextInt();
        System.out.println("What is the width: ");
        int width = input.nextInt();
        System.out.println("What is the height: ");
        int height = input.nextInt();
        int volumeRec = length * width * height;
        System.out.println("The volume is: " + volumeRec);
        System.out.println(" ");
        System.out.println("Sphere");
        System.out.println("What is the radius of the sphere? ");
        double radius = input.nextInt();
        double diameter = radius * 2;
        double volumeSphere = (Math.PI * Math.pow(diameter, 3)) / 6;
        System.out.println("The volume of the sphere is: " + volumeSphere);
        System.out.println(" ");
        System.out.println("Cube");
        System.out.println("What is the length of each side of the cube");
        int cubeLength = input.nextInt();
        double volumeCube = Math.pow(cubeLength, 3);
        System.out.println("The volume of the cube is: " + volumeCube);
    }
}