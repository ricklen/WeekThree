package formatter;

public class Formatter {
	
	public static void printLine(String text, double price){
		System.out.printf("%-10.10s %10.2f", text, price);
	}

	public static void main (String[] args){
		printLine("bla", 2.10);
	}
}
