import java.util.ArrayList;
import java.util.Collections;

public class King {
	public static enum Suit{DIAMOND, CLUB, HEART, SPADE}
	public static enum Rank{_2, _3, _4, _5, _6, _7, _8, _9, _10, _J, _Q, _K, _A}
	ArrayList<Card> deck = new ArrayList<Card>();
	ArrayList<Hand> players = new ArrayList<Hand>();
	
	public King(){
		for(int i=0; i<4; i++){
			players.add(new Hand());
		}
		
		for(Suit suit : Suit.values()){
			for (Rank rank : Rank.values()){
				Card card = new Card(suit, rank);
				System.out.println(card);
				deck.add(card);
			}
		}
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@");
		System.out.println(deck);
		Collections.shuffle(deck);
		System.out.println(deck);
		System.out.println(players);
		
		for(int i=0; i<deck.size();){
			for(int j=0; j<4; j++, i++){
				players.get(j).addCard(deck.get(i));
			}
		}
		System.out.println(players);
		
		for(int i=0; i<4; i++){
			players.get(i).sort();
		}
		System.out.println(players);
		
		System.out.println(Rank.values()[0]);
		
		Rank x = Rank._A;
		Rank y = Rank._K;
		System.out.println(x);
		System.out.println(y.compareTo(x));
		
		Suit a = Suit.SPADE;
		Suit b = Suit.DIAMOND;
		System.out.println(a.compareTo(b));

	}

	public static void main(String[] args) {
		King king = new King();
	}
}
