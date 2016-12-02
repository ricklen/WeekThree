package hotel;

public class PricedRoom extends Room implements Bill.Item {
	
	private double roomPrice;
	
	public PricedRoom(int roomNo, double roomPrice, double safePrice) {
		super(roomNo, new PricedSafe(safePrice));
		this.roomPrice = roomPrice;
	}
	
	public double getAmount() {
		return roomPrice;
	}
	
	public String toString() {
		String s = String.format("%-10.10s", "Safe");
		String b = String.format("%10.2f", roomPrice);
		
		return s + b ;
	}
	
}
