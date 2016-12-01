package test;
import hotel.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {
    private Guest guest;
    private Room room;

    @Before
    public void setUp() {
        guest = new Guest("Jip");
        room = new Room(101);
    }

    @Test
    public void testSetUp() {
        assertEquals(101, room.getNumber());
    }

    @Test
    public void testSetGuest() {
        room.setGuest(guest);
        assertEquals(guest, room.getGuest());
    }
    
    @Test
    public void testSafe() {
    	Safe safe = room.getSafe();
    	Password pass = safe.getPassword();
    	assertTrue(pass.testWord("1234"));
    	assertFalse(safe.open("FalsePassword"));
    	assertFalse(safe.open("1234")); // not yet activated
    	assertTrue(safe.activate("1234"));
    	assertTrue(safe.open("1234"));
    }
    
}
