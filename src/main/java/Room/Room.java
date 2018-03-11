package Room;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public room(int capacity) {
        this.capacity = capacity;
        this.guest = new ArrayList<>();
    }
}
