
import Guest.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Conan", 500);
    }

    @Test
    public void canGetName() {
        assertEquals("Conan", guest.getName());
    }


    @Test
    public void canGetWallet() {
        assertEquals(500, guest.getWallet());
    }
}
