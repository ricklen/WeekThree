package hotel;

public class ItemBill implements Bill.Item {
	public String text;
	public double amount;
	
	public double getAmount() {
		return amount;
	}
	
	public String toString() {
		return "The item = " + text;
	}

}
