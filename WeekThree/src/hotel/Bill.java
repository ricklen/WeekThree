package hotel;

import java.io.*;

public class Bill{
	
	PrintStream printstream = new PrintStream(System.out, true);
	double BillSum;
	
	public interface Item {
		public double getAmount();
		public String toString();
	}
	
	// Constructor
	public Bill(PrintStream theOutStream) {
		printstream = theOutStream;
	}
	
	// Methods
	
	// print the sum of the bill on the outputstream
	public void close() {
		System.out.println(getSum());
		
	}
	
	//add an item to the bill
	public void newItem(Bill.Item item) {
		printstream.append(item.toString());
		BillSum = BillSum + item.getAmount();
	}
	
	// get the total value of a bill
	public double getSum() {
		return BillSum;
	}
	
	// End class
	
	
	
}
	
