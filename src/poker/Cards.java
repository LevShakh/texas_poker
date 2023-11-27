package poker;

import java.util.List;
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
	
	public static String[] sortCards(String[] mas) {
		
		byte el = 0;
		
		String[] res = new String[7];
		
		for(int i = 0; i < CARDS.size(); i++) {
			for(int j = 0; j < mas.length; j++) {
				if(CARDS.get(i) == mas[j].charAt(0)) res[el++] = mas[j];
			}
		}
		
		return res;
	}
	
}
