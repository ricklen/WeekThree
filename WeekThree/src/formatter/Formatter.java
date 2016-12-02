package formatter;

import hotel.*;

import java.io.PrintStream;

public class Formatter {
	
	public static void printLine(String text, double price){
		System.out.printf("%-10.10s %10.2f", text, price);
	}

	public static void main (String[] args){
		ItemBill x = new ItemBill("bla", 2.10);
		ItemBill y = new ItemBill("hoi", 1.33);
		ItemBill b = new ItemBill("rick", 1.90);
		
		PrintStream printstream = new PrintStream(System.out, true);
		
		//PrintStream ps = new PrintStream()
		//System.out.("Huh", 256);
		printstream.append(x.toString());
		printstream.append(y.toString());
		printstream.append(b.toString());
		printstream.append(printLine("bla",2.10));
		
		printstream.println();
		
		System.out.println("\n");
		
		Bill rick = new Bill(printstream);
		
		
		

		
		//printLine("bla", 2.10);
	}
}
