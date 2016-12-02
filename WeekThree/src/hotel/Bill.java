package hotel;

import java.io.*;

public class Bill{
	
	PrintStream printstream = new PrintStream(System.out, true);
	
	public interface Item {
		public double getAmount();
		public String toString();
	}
	
	// Constructor
	public Bill(PrintStream theOutStream) {
		
	}
	
	// Methods
	
	// print the sum of the bill on the outputstream
	public void close() {
	
	}
	
	//add an item to the bill
	public void newItem(Bill.Item item) {
		
	}
	
	// get the total value of a bill
	public double getSum() {
		return 4.4;
	}
	
	// End class
	
	
	
}
	
