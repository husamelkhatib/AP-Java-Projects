
package Q3.ElevensLab.Elevens.ActivityStarterCode.Activity2StarterCode;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class Deck {
	private List<Card> cards;
	private int size;


	public Deck(String[] ranks, String[] suits, int[] values) {
		for(int i = 0; i < ranks.length(); i++){
			Card card = new Card(ranks[i], suits[i], values[i]);
			cards[i] = card;
		}
		size = cards.size();
	}


	public boolean isEmpty() {
		return cards.isEmpty();
	}


	public int size() {
		return cards.size();
	}


	public void shuffle() {

	}

	public Card deal() {

	}


	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {

				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {

				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}