import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class King extends JFrame{
	public static enum Suit{DIAMOND, CLUB, HEART, SPADE}
	public static enum Rank{_2, _3, _4, _5, _6, _7, _8, _9, _10, _J, _Q, _K, _A}
	ArrayList<Card> deck = new ArrayList<Card>();
	ArrayList<Player> players = new ArrayList<Player>();
//	ArrayList<Hand> players = new ArrayList<Hand>();
	Map<String, Integer> remaining_games = new HashMap<String, Integer>();
	
	Random random = new Random();
//	int hand_no;
	
	
	public King(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(400, 300));
		setTitle("King");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGame = new JMenu("Game");
		menuBar.add(mnGame);
		
		for(Suit suit : Suit.values()){
			for (Rank rank : Rank.values()){
				Card card = new Card(suit, rank);
				System.out.println(card);
				deck.add(card);
			}
		}
		newGame();
		
//		remaining_games.put("No Tricks", 2);
//		remaining_games.put("No Hearts", 2);
//		remaining_games.put("No Boys", 2);
//		remaining_games.put("No Queens", 2);
//		remaining_games.put("No King", 2);
//		remaining_games.put("No Last 2", 2);
//		
//		for(int i=0; i<4; i++){
//			players.add(new Hand());
//		}
		
		
		
//		System.out.println("@@@@@@@@@@@@@@@@@@@@");
//		System.out.println(deck);
//		Collections.shuffle(deck);
//		System.out.println(deck);
//		System.out.println(players);
		
//		for(int i=0; i<deck.size();){
//			for(int j=0; j<4; j++, i++){
//				players.get(j).addCard(deck.get(i));
//			}
//		}
//		System.out.println(players);
		
//		for(int i=0; i<4; i++){
//			players.get(i).sort();
//		}
//		System.out.println(players);
		
		System.out.println(Rank.values()[0]);
		
		Rank x = Rank._A;
		Rank y = Rank._K;
		System.out.println(x);
		System.out.println(y.compareTo(x));
		
		Suit a = Suit.SPADE;
		Suit b = Suit.DIAMOND;
		System.out.println(a.compareTo(b));
		System.out.println(remaining_games.get("No King"));
		System.out.println(remaining_games);

		
		setVisible(true);
	}
	
	public void newGame(){
		remaining_games.put("No Tricks", 2);
		remaining_games.put("No Hearts", 2);
		remaining_games.put("No Boys", 2);
		remaining_games.put("No Queens", 2);
		remaining_games.put("No King", 2);
		remaining_games.put("No Last 2", 2);
		
		players.clear();
		for(int i=0; i<4; i++){
			players.add(new Player(true));
//			players.add(new Hand());
		}
		int player = random.nextInt(4);
//		hand_no = 1;
		newHand(player, 1);
	}
	
	public void newHand(int player, int hand_no){
		Collections.shuffle(deck);

		for(int i=0; i<deck.size();){
			for(int j=0; j<4; j++, i++){
				players.get(j).getHand().addCard(deck.get(i));
			}
		}
		
		for(int i=0; i<4; i++){
			players.get(i).getHand().sort();
		}
		for(int i=0; i<4; i++){
			System.out.println(players.get(i).getHand());
		}
//		System.out.println(players);
		System.out.println(player);
		System.out.println(players.get(player).getHand());
		System.out.println("Hand: " + hand_no);
		System.out.println("Player " + (player + 1) + " is the declarer.");
		System.out.println();
		
		if(hand_no < 20){
			hand_no++;
			player = (player + 1) % 4;
			newHand(player, hand_no);
		}
	}

	public static void main(String[] args) {
		King king = new King();
	}
}
