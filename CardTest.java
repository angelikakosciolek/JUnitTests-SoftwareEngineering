import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {

	// Test getSuit
	@Test
	public void test1() {
	    Card card = new Card(13, 0);
	    assertEquals(0, card.getSuit());
	}
	
	// Test getValue
	@Test
	public void test2() {
	    Card card = new Card(2, 5);
	    assertEquals(2, card.getValue());
	}
	
	// Test getValueAsString
	@Test
	public void test3() {
	    Card card1 = new Card(1, 1);
	    assertEquals("Ace", card1.getValueAsString());
	    
	    Card card2 = new Card(2, 1);
	    assertEquals("2", card2.getValueAsString());
	    
	    Card card3 = new Card(3, 2);
	    assertEquals("3", card3.getValueAsString());
	    
	    Card card4 = new Card(4, 0);
	    assertEquals("4", card4.getValueAsString());
	    
	    Card card5 = new Card(5, 3);
	    assertEquals("5", card5.getValueAsString());
	    
	    Card card6 = new Card(6, 0);
	    assertEquals("6", card6.getValueAsString());
	    
	    Card card7 = new Card(7, 1);
	    assertEquals("7", card7.getValueAsString());
	    
	    Card card8 = new Card(8, 2);
	    assertEquals("8", card8.getValueAsString());
	    
	    Card card9 = new Card(9, 3);
	    assertEquals("9", card9.getValueAsString());
	    
	    Card card10 = new Card(10, 1);
	    assertEquals("10", card10.getValueAsString());
	    
	    Card card11 = new Card(11, 2);
	    assertEquals("Jack", card11.getValueAsString());
	    
	    Card card12 = new Card(12, 0);
	    assertEquals("Queen", card12.getValueAsString());
	    
	    Card card13 = new Card(13, 3);
	    assertEquals("King", card13.getValueAsString());
	    
	}
	
	// Test getSuitAsString
	@Test
	public void test4() {
	    Card card1 = new Card(1, 0);
	    assertEquals("Spades", card1.getSuitAsString());
	    
	    Card card2 = new Card(2, 1);
	    assertEquals("Hearts", card2.getSuitAsString());
	    
	    Card card3 = new Card(3, 2);
	    assertEquals("Diamonds", card3.getSuitAsString());
	    
	    Card card4 = new Card(4, 3);
	    assertEquals("Clubs", card4.getSuitAsString());
	}
	
	// Test toString
	@Test
	public void test5() {
	    Card card = new Card(6, 3);
	    String toString = card.toString();
	    assertTrue(toString.contains("6 of Clubs"));
	}
	
	// Test default getValueAsString
	@Test
	public void test6() {
		
		Card card1 = new Card(14, 2);
	    assertEquals("??", card1.getValueAsString());
	    
	    Card card2 = new Card(26, 2);
	    assertEquals("??", card2.getValueAsString());
	}
	
	// Test default getSuitAsString
	@Test
	public void test7() {
		
		Card card1 = new Card(0, 4);
	    assertEquals("??", card1.getSuitAsString());
	    
	    Card card2 = new Card(0, 55);
	    assertEquals("??", card2.getSuitAsString());
	}
	
	
	

}
