package poker;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Poker pokergame = new Poker();
		
		LinkedList<Player> players = new LinkedList<Player>();
		
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		Player p4 = new Player();
		Player p5 = new Player();
		Player p6 = new Player();
		Player p7 = new Player();
		Player p8 = new Player();
		Player p9 = new Player();
		
		
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);
		players.add(p5);
		players.add(p6);
		players.add(p7);
		players.add(p8);
		players.add(p9);
		
		pokergame.play(players);
		
		
	}

}
