/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect out shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();
                
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect in shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectInShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values3 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values3);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values3.length; k++) {
				System.out.print(" " + values3[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
                    //make a temp array of the same length
                    int[] tempyMcTempTemperson = new int[values.length];
                    //save the midpoint (mid) for easy reference
                    int mid = values.length / 2;
                    //unshuffled int that will go up by two
                    int unshuffled = 0;
                    //make a counter (k) that will go up by one
                    int k = 0;
                    
                    //loop k from 0  mid
                    for (; k < mid; k++) {
                        //copy from original array at k to new array	     
                            //   at position unshuffled
                        tempyMcTempTemperson[unshuffled] = values[k];
                        //increase unshuffled by two 	
                        unshuffled += 2;
                    }
                        
                    //reset our unshuffled counter to 1 (instead of 0)	
                    unshuffled = 1;
                    //another loop: from where k left off to the end
                        //same as before
                    for (; k < tempyMcTempTemperson.length; k++) {
                        tempyMcTempTemperson[unshuffled] = values[k];
                        unshuffled += 2;
                    }	
                    // Copy elements back to original array
                    k = 0;
                    for (; k < values.length; k++)
                    {
                    values[k] = tempyMcTempTemperson[k];
                    }

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	
}
        public static void perfectInShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
                    //make a temp array of the same length
                    int[] tempyMcTempTemperson = new int[values.length];
                    //save the midpoint (mid) for easy reference
                    int mid = values.length / 2;
                    //unshuffled int that will go up by two
                    int unshuffled = 1;
                    //make a counter (k) that will go up by one
                    int k = 0;
                    
                    //loop k from 0  mid
                    for (; k < mid; k++) {
                        //copy from original array at k to new array	     
                            //   at position unshuffled
                        tempyMcTempTemperson[unshuffled] = values[k];
                        //increase unshuffled by two 	
                        unshuffled += 2;
                    }
                        
                    //reset our unshuffled counter to 1 (instead of 0)	
                    unshuffled = 0;
                    //another loop: from where k left off to the end
                        //same as before
                    for (; k < tempyMcTempTemperson.length; k++) {
                        tempyMcTempTemperson[unshuffled] = values[k];
                        unshuffled += 2;
                    }	
                    // Copy elements back to original array
                    k = 0;
                    for (; k < values.length; k++)
                    {
                    values[k] = tempyMcTempTemperson[k];
                    }

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	
}
public static void selectionShuffle(int[] values) {
                int tempyBoi;
		for (int k = values.length - 1; k>0; k--) {
                    int pos = (int) (Math.random() * (k + 1));
                    //copy from pos to temp
                    tempyBoi = values[pos];
                    //copy from k to pos
                    values[pos] = values[k];
                    //copy from temp to k
                    values[k] = tempyBoi;
                }
	}
}