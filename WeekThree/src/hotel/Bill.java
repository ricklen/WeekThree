package hotel;

public class Bill{
	
	public static interface Item {
		public String text;
		public double amount;
	}
	
	// Constructor
	public Bill(java.io.PrintStream theOutStream) {
		
	}
	
	// Methods
	public void close() {
		
	}
	
	public void newItem(Bill.Item item) {
		
	}

	public double getSum() {
		return 4.4;
	}
	
	// End class
	
	public class ItemBill implements Bill.Item {
		
	}
	
}
	
