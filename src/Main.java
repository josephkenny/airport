import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Airport airport = new Airport();
        TextUserInterface ui = new TextUserInterface(scanner, airport);
        ui.startAirportPanel();
    }
}
