package hotel;

import java.io.PrintStream;

public class Hotel {
	private String name;
	public PricedRoom room1;
	public PricedRoom room2;
	private Password password;
	//private PrintStream printstream;
	
	public Hotel(String hotelName) {
		this.name = hotelName;
		this.room1 = new PricedRoom(1, 2.00, 10.00);
		this.room2 = new PricedRoom(2, 5, 10);
		this.password = new Password();
	}
	
	
	public Bill getBill(String guestname, int nights, PrintStream ps) {
		Bill newBill = new Bill(ps);
		
		PricedRoom r = getRoom(guestname);
		
		if (r != null && r.getSafe() instanceof Bill.Item) {
			Bill.Item safe = (Bill.Item) r.getSafe();

			PricedRoom billroom = new PricedRoom(r.getNumber(), r.getAmount(), safe.getAmount());
			
			newBill.newItem(safe);
			
			for (int i = 0; i < nights; i ++) {
				newBill.newItem(billroom);	
			}
			newBill.close();
			return newBill;
			} else {
				return null;
			}
	
		
}


	
	//@ requires pass != null && guestname != null;
	/* @ ensures this.getPassword().testWord(pass) && this.getFreeRoom() != null
	 * && this.getRoom(guestname) == null) ==> \result == guestname.getRoom();
	 */
	public Room checkIn(String pass, String guestname) {
		Guest guest = new Guest(guestname);
		if (this.getPassword().testWord(pass)
				&& getFreeRoom() != null && this.getRoom(guestname) == null) {
			
			Room room = getFreeRoom();
			guest.checkin(room);
			assert guest == room.getGuest(); 
			return room;
		} else {
			return null;
		}
	}
	
	//@ requires guestname != null;
	//@ ensures \result == true || \result == false;
	//@ ensures (room1.getGuest() != null && room1.getGuest().getName() == guestname && room1.getGuest() != null) ==> \result == true;
	//@ ensures (room2.getGuest() != null && room2.getGuest().getName() == guestname && room2.getGuest() != null) ==> \result == true;
	public boolean checkOut(String guestname) {
		if (room1.getGuest() != null
				&& room1.getGuest().getName() == guestname && room1.getGuest() != null) {
			room1.getGuest().checkout();
			Safe safe = room1.getSafe();
			safe.deactivate();
			assert safe.isActive == false;
			assert room1.getGuest() == null;
			return true;
		} else if (room2.getGuest() != null
				&& room2.getGuest().getName() == guestname && room2.getGuest() != null) {
			room2.getGuest().checkout();
			Safe safe = room2.getSafe();
			safe.deactivate();
			assert safe.isActive == false;
			assert room2.getGuest() == null;
			return true;
		} else {
			return false;
		}
	}
	
	//@ ensures \result == room1 || \result == room2 || \result == null;
	//@ pure
	public Room getFreeRoom() {
		if (room1.getGuest() == null) {
			return room1;
		} else if (room2.getGuest() == null) {
			return room2;
		} else {
			return null;
		}
	}
	
	//@ requires guestname != null;
	//@ ensures \result == room1 || \result == room2 || \result == null;
	//@ ensures (room1.getGuest() != null && room1.getGuest().getName().equals(guestname)) ==> \result == room1;
	//@ ensures (room2.getGuest() != null && room2.getGuest().getName().equals(guestname)) ==> \result == room2;
	//@ pure
	public PricedRoom getRoom(String guestname) {
		if (room1.getGuest() != null && room1.getGuest().getName().equals(guestname)) {
			return room1;
		} else if (room2.getGuest() != null && room2.getGuest().getName().equals(guestname)) {
			return room2;
		} else {
			return null;
		}
	}
	
	//@ ensures \result != null;
	//@ pure
	public Password getPassword() {
		return password;
	}
	
	//@ ensures \result != null;
	//@ pure
	public String toString() {
		//System.out.println(room1.toString());
		//System.out.println(room2.toString());
		return  room1.toString() + room2.toString();
	}
	
	//@ ensures \result != null;
	//@ pure
	public String getName() {
		return name;
	}
}
