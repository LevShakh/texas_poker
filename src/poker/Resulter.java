package poker;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Resulter {
	
	private final int MAX_CARDS = 7;
	
	private List<String> cards = new LinkedList<String>();
	private List<Character> values = new ArrayList<Character>(MAX_CARDS);
	private List<Character> suits = new ArrayList<Character>(MAX_CARDS);
	private byte pairs = 0;
	private boolean three = false;
	private boolean four = false;
	private boolean isflush = false;
	private boolean isstraight = false;
//	private boolean isstraightflush = false;
//	private boolean isroyal = false;
	
	public Resulter(Entity p, Entity t) {
		int i = 0;
		
		cards.addAll(p.getCardsList());
		cards.addAll(t.getCardsList());
		
		
		cards = Cards.sortCards(cards);
		
		setValues();
		
		isFlush();
		isStraight();
		
//		getCards();
//		values = Cards.sortCards(values);
//		Arrays.sort(suits);
	}
	
	public Resulter() {
		char[] values1 = new char[] {'2', '3', '4', '5', '6', 'A', '7'};
		
		
		
//		if(isStraight()) System.out.println("Straight");
		
		for(int i = 0; i < values1.length; i++) {
			
			if( i < 6 && values1[i] == values1[i+1] && pairs < 2) {
				pairs++;
				i++;
			}
			
			if(i < 5 && values1[i] == values1[i+1]) {
				three = true;
				pairs--;
				i++;
			}
			
			if(i < 4 && values1[i] == values1[i+1]) {
				four = true;
				three = false;
			}
		}
			
			
			
		if(four) System.out.println("Four of a kind");
		
		else if(pairs != 0 && three) System.out.println("Full house");
		
		else if(three) System.out.println("Three of a kind");
		
		else if(pairs==1) System.out.println("One pair"); 

		else if(pairs==2) System.out.println("Two pairs");
		
		else System.out.println("High card");
	}
	
//	private void isRoyal() {
//		
//		byte straight = 0;
//		
//		for(int i = 0; i < cards.length; i++) {
//			for(int j = 0; j < 5; j++) {
//				if(cards[i].charAt(0) == Cards.CARDS[j+8])
//			}
//		}
//	}
//	
//	private void isStraightFlush() {
//		
//	}
	
	private void isStraight() {
		
		byte straight = 0;
		boolean istwoace = values.get(0) == Cards.CARDS.get(0) && values.get(values.size() - 1) == Cards.CARDS.get(Cards.CARDS.size() - 1) ? true : false;
		
		
		for(int i = 0; i < Cards.CARDS.size(); i++) {
			byte jmp = 0;
			for(int j = 0 + jmp; j < values.size(); j++) {
				
				if(i+straight < Cards.CARDS.size() && values.get(j) == Cards.CARDS.get(i+straight) && straight < 5) {
					straight++;
				}
				
				else if(straight == 5 || straight == 4 && istwoace) {
					isstraight = true;
					return;
				}
				else {
					i += straight;
					jmp += straight;
					straight = 0;
				}
			}
		}
	}
	
	private void isFlush() {
		for(int i = 0; i < 4; i++) {
			if(i < MAX_CARDS - i - 1 && suits.get(i) == suits.get(i+1) &&
					suits.get(i) == suits.get(i+2) && suits.get(i) == suits.get(i+3) &&
					suits.get(i) == suits.get(i+4)) {
				isflush = true;
				break;
			}
		}
	}
	
	private void setValues() {
		for(String card : cards) {
			values.add(card.charAt(0));
			suits.add(card.charAt(2));
		}
	}
	
	public void getCards() {
		for(int i = 0; i < cards.size(); i++) {
			System.out.print(cards.get(i) + "   ");
			System.out.print(suits.get(i) + "   ");
		}
		
		System.out.print("\n");
	}
	
	public void getValues() {
		for(Character val : values) {
			System.out.print(val + "   ");
		}
		
		System.out.print("\n");
	}
	
	public void getSuits() {
		for(Character suit : suits) {
			System.out.print(suit + "   ");
		}
		
		System.out.print("\n");
	}
	
	public String getCombs() {
		
		for(int i = 0; i < values.size(); i++) {
			
			if( i < 6 && values.get(i) == values.get(i+1) && pairs < 2) {
				pairs++;
				i++;
			}
			
			if(i < 5 && values.get(i) == values.get(i+1)) {
				three = true;
				pairs--;
				i++;
			}
			
			if(i < 4 && values.get(i) == values.get(i+1)) {
				four = true;
				three = false;
			}
		}
			
			
			
		if(four) return "Four of a kind";
		
		else if(pairs != 0 && three) return "Full house";
		
		else if(isflush) return "Flush";
		
		else if(isstraight) return "Straight";
		
		else if(three) return "Three of a kind";
		
		else if(pairs==1) return "One pair"; 

		else if(pairs==2) return"Two pairs";
		
		else return "High card";
		
	}
	
}
