public class Flight {
    private Airplane airplane;
    private final String departureAirportCode;
    private final String destinationAirportCode;

    public Flight(Airplane airplane, String departureAirportCode, String destinationAirportCode) {
        this.airplane = airplane;
        this.departureAirportCode = departureAirportCode;
        this.destinationAirportCode = destinationAirportCode;
    }

    @Override
    public String toString() {
        return airplane + " (" + departureAirportCode + "-" + destinationAirportCode + ")";
    }
}
