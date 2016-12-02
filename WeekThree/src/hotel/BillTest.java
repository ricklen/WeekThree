
package hotel;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



public class BillTest {
	private Bill bill;

    @Before
    public void setUp() {
    	bill = new Bill(System.out);
    }
    
    // Creating a new item
    @Test
    public void itemTest() {
    	ItemBill bier = new ItemBill("Pils", 5);
    	ItemBill emmer = new ItemBill("Braakemmer", 5);
    	ItemBill movies = new ItemBill("Sexy Virgins 7", 10);
    	ItemBill wiet = new ItemBill("\"Geen wiet\"", 300);
    	ItemBill robin = new ItemBill("Robin", 10000);
    	assertTrue(bill.getSum() == 0);
    	bill.newItem(bier);
    	assertTrue(bill.getSum() == 5);
    	bill.newItem(emmer);
   		assertTrue(bill.getSum() == 10);
   		bill.newItem(movies);
   		bill.newItem(wiet);
   		bill.newItem(robin);
   		
   		bill.close();
    }
    
    @Test
    public void closeTest() {
    	//bill.close();
    }
    

}
