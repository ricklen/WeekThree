package hotel;

public class PricedSafe extends Safe implements Bill.Item {
	
	double safePrice;
	
	public PricedSafe(double price) {
		safePrice = price;
	}
	
	public double getAmount() {
		return safePrice;
	}
	
	public String toString(){
		String s = String.format("%-10.10s", "Safe");
		String b = String.format("%10.2f", safePrice);
		
		return s + b ;
	}

}
