import Rooms.Bedroom;
import Rooms.BedroomType;
import Rooms.ConferenceRoom;
import Rooms.DiningRoom;
import Guest.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before() {
        bedroom1 = new Bedroom(BedroomType.SINGLE, 1, 50.00);
        bedroom2 = new Bedroom(BedroomType.DOUBLE, 2, 85.00);
        bedroom3 = new Bedroom(BedroomType.TRIPLE, 3, 140.00);
        bedroom4 = new Bedroom(BedroomType.FAMILY, 4, 160.00);




    }

}
