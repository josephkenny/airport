public class Flight {
    private final String id;
    private final String departureAirportCode;
    private final String destinationAirportCode;

    public Flight(String id, String departureAirportCode, String destinationAirportCode) {
        this.id = id;
        this.departureAirportCode = departureAirportCode;
        this.destinationAirportCode = destinationAirportCode;
    }

    public String getId() {
        return id;
    }

    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    @Override
    public String toString() {
        return id + " (" + departureAirportCode + "-" + destinationAirportCode + ")";
    }
}
