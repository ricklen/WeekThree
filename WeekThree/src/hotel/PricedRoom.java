package hotel;

public class PricedRoom extends Room implements Bill.Item {
	
	public PricedRoom(int no, double roomPrice, double safePrice) {
		super(no);
		
	}
	
	public double getAmount() {
		return 0.0;
	}

}
