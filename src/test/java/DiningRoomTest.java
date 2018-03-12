import Guest.Guest;
import Rooms.DiningRoom;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class DiningRoomTest {
    DiningRoom diningroom;
    Guest guest;

    @Before
    public void before() {
        diningroom = new DiningRoom("Rainbow", 75 );
        guest = new Guest("Jack", 300);
    }

    @Test
    public void canGetCapacity() {
        assertEquals(75, diningroom.getCapacity());
    }

    @Test
    public void canGetName() {
        assertEquals("Rainbow", diningroom.getName());
    }


    @Test
    public void roomIsEmpty() {
        assertEquals(0, diningroom.guestCount());
    }
    @Test
    public void addGuestToRoom() {
        diningroom.addGuest(guest);
        assertEquals(1, diningroom.guestCount());
    }

    @Test
    public void canRemoveGuest() {
        diningroom.addGuest(guest);
        assertEquals(1, diningroom.guestCount());
        diningroom.removeGuest(guest);
        assertEquals(0, diningroom.guestCount());
    }

    @Test
    public void roomIsFull() {
        {
            for (int i = 0; i < 75; i++) {
                diningroom.addGuest(guest);
            }
            assertEquals(75, diningroom.guestCount());
            assertTrue(diningroom.isRoomFull());
        }
    }

}
