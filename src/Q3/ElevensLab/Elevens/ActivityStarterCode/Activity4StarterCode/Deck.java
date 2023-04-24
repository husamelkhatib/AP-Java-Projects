package Q3.ElevensLab.Elevens.ActivityStarterCode.Activity4StarterCode;

import java.util.List;
import java.util.ArrayList;


public class Deck {


	private List<Card> cards;


	private int size;



	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card>();
		for (int j = 0; j < ranks.length; j++) {
			for (String suitString : suits) {
				cards.add(new Card(ranks[j], suitString, values[j]));
			}
		}
		size = cards.size();
		shuffle();
	}



	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}


	public void shuffle() {
		//Traverses array from the last position.
		for(int k = valueCount - 1; k >= 0; k--) {
			int r = (int)(Math.random() * k);
			int temp = values[r];
			values[r] = values[k];
			values[k] = temp;
		}
	}


	public Card deal() {
		if (isEmpty()) {
			return null;
		}
		size--;
		Card c = cards.get(size);
		return c;
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