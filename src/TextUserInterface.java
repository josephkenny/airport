import java.util.Scanner;

public class TextUserInterface {
    private final Scanner scanner;
    private final Airport airport;

    public TextUserInterface(Scanner scanner, Airport airport) {
        this.scanner = scanner;
        this.airport = airport;
    }

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
                    addPlane();
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
                    airport.printAirplanes();
                    break;
                case "2":
                    airport.printFlights();
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

    private void addPlane() {
        System.out.print("Give plane ID: ");
        String id = scanner.nextLine();

        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());

        airport.addAirplane(id, capacity);
    }

    private void addFlight() {
        System.out.print("Give plane ID: ");
        String id = scanner.nextLine();

        System.out.print("Give departure airport code: ");
        String departureAirportCode = scanner.nextLine();

        System.out.print("Give destination airport code: ");
        String destinationAirportCode = scanner.nextLine();

        airport.addFlight(id, departureAirportCode, destinationAirportCode);
    }

    private void printAirplaneInfo() {
        System.out.print("Give plane ID: ");
        String id = scanner.nextLine();

        airport.printAirplaneInfo(id);
    }
}
