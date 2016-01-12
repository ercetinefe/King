import java.util.ArrayList;
import java.util.Collections;

public class Hand {
	ArrayList<Card> cards = new ArrayList<Card>();

	public Hand(){
		
	}
	
	public void addCard(Card card){
		cards.add(card);
	}
	
	public void removeCard(Card card){
		cards.remove(card);
	}
	
	public void sort(){
		Collections.sort(cards);
	}
	
	public String toString(){
		return cards.toString();
	}
}
