package Rooms;

public class ConferenceRoom extends Room {
    private String name;
    private Double dayRate;

    public ConferenceRoom(int capacity, String name, double dayRate) {
        super(capacity);
        this.name = name;
        this.dayRate = dayRate;

    }


    public String getName() {
        return this.name;
    }

    public double getDayRate() {
        return this.dayRate;
    }
}
