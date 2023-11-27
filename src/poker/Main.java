package poker;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Poker pokergame = new Poker();
		
		List<Entity> players = new LinkedList<Entity>();
		
		Entity p1 = new Player();
		Entity p2 = new Player();
		Entity p3 = new Player();
		Entity p4 = new Player();
		Entity p5 = new Player();
		Entity p6 = new Player();
		Entity p7 = new Player();
		Entity p8 = new Player();
		Entity p9 = new Player();
		
		
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);
		players.add(p5);
		players.add(p6);
		players.add(p7);
		players.add(p8);
		players.add(p9);
		
//		players.get(0).iam();
//		
//		Player pl = (Player)players.get(0);
//		
//		pl.iam();
		
//		List<Entity> pl = new LinkedList<>();
//		pl.add(p1);
//		
//		for(int i = 0; i < 1000; i++) {
//			pokergame.play(pl);
//			pl.get(0).nullHand();
//		}
		
		pokergame.play(players);
		
		
	}

}
