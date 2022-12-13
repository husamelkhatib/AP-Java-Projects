import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435a {
    public static void main(String[] args) {
        // Define the vehicle type names and factors
        String[] vehicleTypes = {
                "Compact Car", "Small Car", "Mid Size Car", "Full Size Car",
                "Truck", "16 Wheeler"};
        double[] factors = {1.0, 1.3, 1.6, 2.0, 2.4, 2.7};

        // Define the gate tolls
        double[] tolls = {1.35, 2.00, 2.50, 3.25, 4.10, 4.80, 5.50, 6.00};

        // Read the input data from a file
        try (Scanner input = new Scanner(new File("data/prog435a.dat"))) {
            while (input.hasNext()) {
                // Read the vehicle type and gate number
                int vehicleType = input.nextInt();
                int gate = input.nextInt();

                // Calculate the base toll and the total cost
                double baseToll = tolls[gate - 1];
                double factor = factors[vehicleType - 1];
                double cost = baseToll * factor;

                // Output the vehicle type, base toll, factor, and total cost
                System.out.println(
                        "Car Type: " + vehicleTypes[vehicleType - 1] + ", " +
                                "Base Toll: $" + baseToll + ", " +
                                "Factor: " + factor + ", " +
                                "Cost: $" + cost
                );
            }
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
