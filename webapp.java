import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusApplication {
    public static void main(String[] args) {
        List<Bus> busList = new ArrayList<>();

        // Create some sample buses
        Bus bus1 = new Bus("Bus 1", "Route A");
        Bus bus2 = new Bus("Bus 2", "Route B");
        Bus bus3 = new Bus("Bus 3", "Route C");

        // Add the buses to the list
        busList.add(bus1);
        busList.add(bus2);
        busList.add(bus3);

        Scanner scanner = new Scanner(System.in);

        // Main application loop
        while (true) {
            System.out.println("Bus Application");
            System.out.println("1. View Buses");
            System.out.println("2. Add Bus");
            System.out.println("3. Remove Bus");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewBuses(busList);
                    break;
                case 2:
                    addBus(busList, scanner);
                    break;
                case 3:
                    removeBus(busList, scanner);
                    break;
                case 4:
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void viewBuses(List<Bus> busList) {
        System.out.println("Buses:");
        for (Bus bus : busList) {
            System.out.println(bus.getName() + " - " + bus.getRoute());
        }
        System.out.println();
    }

    public static void addBus(List<Bus> busList, Scanner scanner) {
        System.out.print("Enter the bus name: ");
        String name = scanner.next();
        System.out.print("Enter the bus route: ");

