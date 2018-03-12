package Rooms;

public class Bedroom extends Room {
    BedroomType type;
    private int roomNumber;
    private double dayRate;


    public Bedroom(BedroomType type, int roomNumber, Double dayRate) {
        super(type.getCapacity());
        this.type = type;
        this.roomNumber = roomNumber;
        this.dayRate = dayRate;
    }

    public BedroomType getType() {
        return type;
    }

    public int getRoom() {
        return this.roomNumber;
    }

    public double getNightRate() {
        return this.dayRate;
    }
}
