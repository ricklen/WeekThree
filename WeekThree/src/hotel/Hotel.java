package hotel;

public class Hotel {
	private String name;
	private Room room1;
	private Room room2;
	private Password password;
	
	public Hotel(String hotelName) {
		this.name = hotelName;
		this.room1 = new Room(1);
		this.room2 = new Room(2);
		this.password = new Password();
	}
	
	//
	public Room checkIn(String pass, String guestname) {
		Guest guest = new Guest(guestname);
//		System.out.println(this.getPassword().testWord(pass));
//		System.out.println(this.getRoom(guestname));
		
		if (this.getPassword().testWord(pass)
				&& this.getFreeRoom() != null && this.getRoom(guestname) == null) {
			
			Room room = getFreeRoom();
			guest.checkin(room);
			return room;
		} else {
			return null;
		}
	}
	
	//
	public boolean checkOut(String guestname) {
		if (room1.getGuest() != null && room1.getGuest().getName() == guestname && room1.getGuest() != null) {
			room1.getGuest().checkout();
			Safe safe = room1.getSafe();
			safe.deactivate();
			return true;
		} else if (room2.getGuest() != null && room2.getGuest().getName() == guestname && room2.getGuest() != null) {
			room2.getGuest().checkout();
			Safe safe = room2.getSafe();
			safe.deactivate();
			return true;
		} else {
			return false;
		}
	}
	
	//
	public Room getFreeRoom() {
		if (room1.getGuest() == null) {
			return room1;
		} else if (room2.getGuest() == null) {
			return room2;
		} else {
			return null;
		}
	}
	
	//
	public Room getRoom(String guestname) {
		if (room1.getGuest() != null && room1.getGuest().getName().equals(guestname)) {
			return room1;
		} else if (room2.getGuest() != null && room2.getGuest().getName().equals(guestname)) {
			return room2;
		} else {
			return null;
		}
	}
	
	//
	public Password getPassword() {
		return password;
	}
	
	//
	public String toString() {
		System.out.println(room1.toString());
		System.out.println(room2.toString());
		return  (room1.toString() + room2.toString());
	}
	
	//
	public String getName() {
		return name;
	}
}
