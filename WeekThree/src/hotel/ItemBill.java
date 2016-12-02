package hotel;

public class ItemBill implements Bill.Item {
	public String text;
	public double amount;
	
	public ItemBill(String text, double amount){
		this.text = text;
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public String toString() {
		String s = String.format("%-30.30s", text);
		String b = String.format("%20.2f", amount);
		
		
		return s + b ;
				
	}

}
