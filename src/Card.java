public class Card implements Comparable<Card>{
	private King.Suit suit;
	private King.Rank rank;
	
	public Card(King.Suit suit, King.Rank rank){
		this.suit = suit;
		this.rank = rank;
	}

	public int compareTo(Card c){
		if (this.suit.compareTo(c.suit) == 0) {
			return c.rank.compareTo(this.rank);
		}
		else{
			return c.suit.compareTo(this.suit);
		}	
	}
	
	public King.Rank getRank(){
		return rank;
	}
	
	public King.Suit getSuit(){
		return suit;
	}
	
	public String toString(){
		return suit + "- " + rank;
	}
}
