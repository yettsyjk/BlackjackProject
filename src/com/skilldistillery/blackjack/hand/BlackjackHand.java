package com.skilldistillery.blackjack.hand;

import com.skilldistillery.blackjack.cards.Card;

public class BlackjackHand extends Hand{
	public BlackjackHand() {
		super();
	}
	
	@Override
	public int getHandValue() {
		int playerValue = 0;
		
		//iterating forward over the array in single elements dataType is Card
		// variable card followed by array collection getCards()
		for (Card card : getCards()) {
			playerValue += card.getValue();
		}
		return playerValue;
	}
	
	public boolean typeBlackjack() {
		return getHandValue() == 21;
	}
	
	public boolean typeBust() {
		return getHandValue() > 21;
	}
	
	
	
	
}
