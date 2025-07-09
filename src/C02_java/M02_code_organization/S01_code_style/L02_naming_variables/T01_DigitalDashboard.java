package C02_java.M02_code_organization.S01_code_style.L02_naming_variables;

/*
Design a Java program for a vehicle tracking system. Create variables to store
a vehicle's ID, speed, and fuel level. Implement a method to update
these values and another to display the vehicle's status. Use meaningful
variable names following Java conventions. Ensure that the speed is
non-negative and the fuel level is between 0 and 100. Input: A single line
containing the vehicle ID (string), speed (float), and fuel level (float)
separated by spaces. Output: A single line with the formatted vehicle status.
*/

import java.util.Scanner;

public class T01_DigitalDashboard {
    // Vehicle properties
    private String vehicleId;
    private float speed;
    private float fuelLevel;

    // Method to update vehicle status
    public void updateVehicleStatus(String id, float newSpeed, float newFuelLevel) {
        // Implement the logic to update vehicle status here
        vehicleId = id;
        speed = newSpeed;
        fuelLevel = newFuelLevel;
    }

    // Method to display vehicle status
    public String getVehicleStatus() {
        // Implement the logic to return formatted vehicle status here
        return "Vehicle " + vehicleId + ": Speed = " + speed + " km/h, Fuel = " + fuelLevel + "%\n";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        T01_DigitalDashboard vehicle = new T01_DigitalDashboard();
        vehicle.updateVehicleStatus(parts[0], Float.parseFloat(parts[1]), Float.parseFloat(parts[2]));
        System.out.println(vehicle.getVehicleStatus());

        scanner.close();
    }
}
