/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
                
                /**** CARD 1 ****/
                System.out.println("\nCARD 1 TESTS");
                Card x = new Card("king", "clubs", 13);
                System.out.println("My card is ranked: " + x.rank());
                System.out.println("My card has the suit: " + x.suit());
                System.out.println("My card has the value: " + x.pointValue());
                System.out.println(x);
                /**** CARD 2 ****/
                Card y = new Card("king", "clubs", 13);
                System.out.println("\nCARD 2 TESTS");
                System.out.println("My card is ranked: " + y.rank());
                System.out.println("My card has the suit: " + y.suit());
                System.out.println("My card has the value: " + y.pointValue());
                System.out.println(y);
                System.out.println("This should be true: " + x.matches(y));
                /**** CARD 3 ****/
                System.out.println("\nCARD 3 TESTS");
                Card z = new Card("Brian", "Charlie", 456);
                System.out.println("My card is ranked: " + z.rank());
                System.out.println("My card has the suit: " + z.suit());
                System.out.println("My card has the value: " + z.pointValue());
                System.out.println(z);
                System.out.println("This should be true: " + x.matches(z));
	}
}
