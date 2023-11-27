package poker;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;

public class Cards {
	
	
	private static final Character[] array = {'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};
	
	public static final List<Character> CARDS = new ArrayList<Character>(Arrays.asList(array));
	
	private char[] cards = new char[]
			{'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A',
			'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A',
			'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A',
			'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};
	
	private final byte quantity = 13;
	
	private final String[] suits = new String[] {new String(Character.toChars(0x2666)), 
			new String(Character.toChars(0x2665)), 
			new String(Character.toChars(0x2660)), 
			new String(Character.toChars(0x2663))};
	
	/**
	 * Takes index of cards array and returns a suit for a card
	 * @param i index of Cards.cards array
	 * @return suit of the card as String. Diamond, Heart, Spade or Clove 
	 */
	private String setSuit(int i) {
		switch(i / quantity) {
			case 0:
				return suits[0];
			case 1:
				return suits[1];
			case 2:
				return suits[2];
			case 3:
				return suits[3];
			default:
				return "Error";
		}
	}
	
	/**
	 * Sets random card from cards array. It takes a value from cards array and invokes setSuit() 
	 * method to designate a suit. Returns string of card. Example "5 ♦". Taken card takes "-" value. This means
	 * that this card is used already. It cant be given twice or more
	 * @return String card. Example "5 ♦"
	 */
	public String setRandomCard() {
		String card = "";
		int i;
		while (true) {
			i = (int)(Math.random() * 52);
			if(cards[i] != '-') {
				card += cards[i] + " " + setSuit(i);
				break;
			}
			else continue;
		}
		cards[i] = '-';
		return card;
	}
	
	/**
	 * Sorts list of cards. It is used to sort seven cards when Resulter is in work. 
	 * It sorts table's and player's cards by card rank according to CARDS List.
	 * Sorting is like 2, 3, 4, 5, 6, 7, 8, 9, T (Ten), J (Jack), Q (Queen), K (King), A (Ace)
	 * @param mas List of cards to be sorted
	 * @return Sorted list of cards
	 */
	public static List<String> sortCards(List<String> mas) {
		
		List<String> res = new LinkedList<String>();
		
		for(int i = 0; i < CARDS.size(); i++) {
			for(int j = 0; j < mas.size(); j++) {
				if(CARDS.get(i) == mas.get(j).charAt(0)) {
					res.add(mas.get(j));
				}
			}
		}
		
		return res;
	}
	
}
