import Guest.Guest;
import Rooms.Bedroom;
import Rooms.Room;
import Rooms.BedroomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom(BedroomType.SINGLE, 90, 50);
        guest = new Guest("Morag", 200);
    }

    @Test
    public void canGetType() {
        assertEquals(BedroomType.SINGLE, bedroom.getType());

    }

    @Test
    public void canGetRoomNumber() {
        assertEquals(90, bedroom.getRoom());
    }

    @Test
    public void canGetNighRate() {
        assertEquals(50, bedroom.getNightRate(), 0.01);
    }

    @Test
    public void canGetCapacity() {
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void roomIsEmpty() {
        assertEquals(0, bedroom.guestCount());
    }
    @Test
    public void addGuestToRoom() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canRemoveGuest() {
        assertEquals(0, bedroom.guestCount());
    }



}

