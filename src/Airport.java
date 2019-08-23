import java.util.ArrayList;
import java.util.List;

public class Airport {
    private final List<Airplane> airplanes = new ArrayList<>();
    private final List<Flight> flights = new ArrayList<>();

    public void addAirplane(String id, Integer capacity) {
        airplanes.add(new Airplane(id, capacity));
    }

    public void addFlight(String id, String departureAirportCode, String destinationAirportCode) {
        flights.add(new Flight(id, departureAirportCode, destinationAirportCode));
    }

    public void printAirplanes() {
        for (Airplane airplane : airplanes) {
            System.out.println(airplane);
        }
    }

    public void printFlights() {
        for (Flight flight : flights) {
            for (Airplane airplane : airplanes) {
                if (airplane.getId().equals(flight.getId())) {
                    System.out.println(flight.getId() + " (" + airplane.getCapacity() + " people) " +
                            "(" + flight.getDepartureAirportCode() + "-" + flight.getDestinationAirportCode() + ")");
                }
            }
        }
    }

    public void printAirplaneInfo(String id) {
        for (Airplane airplane : airplanes) {
            if (airplane.getId().equals(id)) {
                System.out.println(airplane.getId() + " (" + airplane.getCapacity() + " people)");
            } else {
                System.out.println("Plane with ID " + id + " doesn't exist");
            }
        }
    }
}
