package com.skilldistillery.blackjack.players;

import com.skilldistillery.blackjack.hand.BlackjackHand;

public class BlackjackPlayer extends Player {
	private BlackjackHand hand;
	
	
	public BlackjackPlayer() {
		super();
		hand = new BlackjackHand();
		
	}


	public BlackjackHand getHand() {
		return hand;
	}


	public void setHand(BlackjackHand hand) {
		this.hand = hand;
	}
	
	public boolean typeBlackjack() {
		return hand.typeBlackjack();
	}
	
	public boolean typeBust() {
		return hand.typeBust();
	}
	
	public int getHandTotal() {
		return hand.getHandValue();
	}


	@Override
	public String toString() {
		return "BlackjackPlayer [Hand = " + hand.getHandValue() + " ] ";
	}
	
	
	
	
}




