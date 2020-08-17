public class Airplane {
    private final String id;
    private final int capacity;

    public Airplane(String id, Integer capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return id + " (" + capacity + " people)";
    }
}
