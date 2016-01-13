public class Player {
	private boolean human;
	private int remaining_positive_hands;
	private int remaining_negative_hands;
	private Hand hand;
	
	public Player(boolean human){
		this.human = human;
		remaining_positive_hands = 2;
		remaining_negative_hands = 3;
		hand = new Hand();
	}
	
	public Hand getHand(){
		return hand;
	}

	public boolean isHuman(){
		return human;
	}
	
	public int remainingNegativeNo(){
		return remaining_negative_hands;
	}
	
	public int remainingPositiveNo(){
		return remaining_positive_hands;
	}

}
