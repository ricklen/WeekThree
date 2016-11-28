package hotel;

public class Guest {
	
	private String name;
	private Room r;
	
	public Guest(String n) {
		this.name = n;
	}
	
	public boolean checkin(Room room) {
		if (r == null && room.getGuest() == null) {
			r = room;
			room.setGuest(this);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkout() {
		if (r != null) {
			r.setGuest(null);
			r = null;
			return true;
		}	else {
			return false;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public Room getRoom() {
		return r;
	}
	
	public String toString() {
		return "Guest: " + name + ", Room: " + r.getNumber();
		
	}
	
	
}