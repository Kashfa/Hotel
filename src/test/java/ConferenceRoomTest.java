import Rooms.ConferenceRoom;
import Guest.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConferenceRoomTest {
    ConferenceRoom conferenceroom;
    Guest guest;

    @Before
    public void before() {
        conferenceroom = new ConferenceRoom(30, "Spock", 800);
        guest = new Guest("Kirk", 400);

    }

    @Test
    public void canGetCapacity() {
        assertEquals(30, conferenceroom.getCapacity());
    }

    @Test
    public void canGetName() {
        assertEquals("Spock", conferenceroom.getName());
    }

    @Test
    public void canGetDayRate() {
        assertEquals(800, conferenceroom.getDayRate(), 0.01);
    }

    @Test
    public void roomIsEmpty() {
        assertEquals(0, conferenceroom.guestCount());
    }
    @Test
    public void addGuestToRoom() {
        conferenceroom.addGuest(guest);
        assertEquals(1, conferenceroom.guestCount());
    }

    @Test
    public void canRemoveGuest() {
        conferenceroom.addGuest(guest);
        assertEquals(1, conferenceroom.guestCount());
        conferenceroom.removeGuest(guest);
        assertEquals(0, conferenceroom.guestCount());
    }

    @Test
    public void roomIsFull() {
            {
            for (int i = 0; i < 30; i++) {
                conferenceroom.addGuest(guest);
            }
            assertEquals(30, conferenceroom.guestCount());
            assertTrue(conferenceroom.isRoomFull());
        }
    }





}
