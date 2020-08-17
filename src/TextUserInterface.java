import java.util.HashMap;
import java.util.Scanner;

public class TextUserInterface {
    private final Scanner scanner = new Scanner(System.in);
    private final HashMap<String, Airplane> airplanes = new HashMap<>();
    private final HashMap<String, Flight> flights = new HashMap<>();

    public void startAirportPanel() {
        System.out.printf("Airport panel%n--------------------%n");

        boolean quit = false;

        while (!quit) {
            printAirportPanelMenu();
            String input = scanner.nextLine();

            switch (input.toLowerCase()) {
                case "x":
                    startFlightServicePanelMenu();
                    quit = true;
                    break;
                case "1":
                    addAirPlane();
                    break;
                case "2":
                    addFlight();
                    break;
                default:
                    System.out.printf("%nEnter a valid command:%n");
                    break;
            }
        }
    }

    private void startFlightServicePanelMenu() {
        System.out.printf("%nFlight service%n--------------------%n");

        boolean quit = false;

        while (!quit) {
            printFlightServicePanelMenu();
            String input = scanner.nextLine();

            switch (input.toLowerCase()) {
                case "x":
                    quit = true;
                    break;
                case "1":
                    printAirplanes();
                    break;
                case "2":
                    printFlights();
                    break;
                case "3":
                    printAirplaneInfo();
                    break;
                default:
                    System.out.printf("%nEnter a valid command:%n");
                    break;
            }
        }
    }

    private void printAirportPanelMenu() {
        System.out.printf("%nChoose operation:%n"
                + "[1] Add airplane%n"
                + "[2] Add flight%n"
                + "[x] Exit%n> ");
    }

    private void printFlightServicePanelMenu() {
        System.out.printf("%nChoose operation:%n"
                + "[1] Print planes%n"
                + "[2] Print flights%n"
                + "[3] Print plane info%n"
                + "[x] Quit%n> ");
    }

    private void addAirPlane() {
        System.out.print("Give plane ID: ");
        String id = scanner.nextLine();

        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());

        airplanes.put(id, new Airplane(id, capacity));
    }

    private void addFlight() {
        System.out.print("Give plane ID: ");
        String id = scanner.nextLine();
        Airplane airplane = airplanes.get(id);

        System.out.print("Give departure airport code: ");
        String departureAirportCode = scanner.nextLine();

        System.out.print("Give destination airport code: ");
        String destinationAirportCode = scanner.nextLine();

        Flight flight = new Flight(airplane, departureAirportCode, destinationAirportCode);
        flights.put(id, flight);
    }

    private void printAirplanes() {
        for (Airplane plane : airplanes.values()) {
            System.out.println(plane);
        }
    }

    private void printFlights() {
        for (Flight flight : flights.values()) {
            System.out.println(flight);
        }
    }

    private void printAirplaneInfo() {
        System.out.print("Give plane ID: ");
        String id = scanner.nextLine();

        if (airplanes.containsKey(id)) {
            Airplane airplane = airplanes.get(id);
            System.out.println(airplane);
        } else {
            System.out.println("Plane with ID " + id + " does not exist.");
        }
    }
}
