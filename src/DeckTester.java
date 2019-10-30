/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
                    // REUSABLE ASSETS
                    String[] suits = {"clubs", "hearts", "diamonds", "spades"};
                    String[] ranks = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
                    int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
                    
                    //NEW ASSETS
                    String[] differentTeams = {"Philladelphia Fusion", "Vancouver Titans", "Atlanta Reign", "LA Valiant"};
                    String[] differentHeroes = {"Tracer", "Widowmaker", "Winston", "Doomfist", "Genjii", "Lucio", "Ana", "Baptiste", "D.va", "Orisa", "Wrecking Ball", "Hanzo", "Zenyatta"};
                    int[] skillRank = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
                    
                /* Example Deck 1 */
                System.out.println("----TESTING DECK 1----");
                // create a deck
                    Deck deckBoi = new Deck(ranks, suits, pointValues);
                // test its size
                     System.out.println("Deck size: " + deckBoi.size());
                // deal one card
                     Card x = deckBoi.deal();
                     System.out.println("I just dealt: " + x);
                     System.out.println("Now my deck size is: " + deckBoi.size());
                // test two string
                    System.out.println(deckBoi);
                    
                /* Example Deck 2 */
                System.out.println("----TESTING DECK 2----");
                // create a deck
                    Deck overwatchLeague = new Deck(differentHeroes, differentTeams, skillRank);
                // test its size
                     System.out.println("Deck size: " + overwatchLeague.size());
                // deal untill empty
                    while(!overwatchLeague.isEmpty()) {
                        overwatchLeague.deal();
                    }
                    System.out.println(overwatchLeague);
	}
}

