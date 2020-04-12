package com.skilldistillery.blackjack.hand;

import com.skilldistillery.blackjack.cards.Card;

public class BlackjackHand extends Hand {
	public BlackjackHand() {
		super();
	}
	
	@Override
	public int getHandValue() {
		int playerValue = 0;
		//abstract method from Hand BlackjackHand defines the method
		//iterating forward over the array in single elements dataType is Card
		// variable card followed by array collection getCards()
		//method will evaluate first card and add the value of the second card, repeating method for each card
		for (Card card : getCards()) {
			playerValue += card.getValue();
			//System.out.println("Printing in BlackjackHand.java line 18"+ playerValue);
		}
		return playerValue;
	}
	
	public boolean typeBlackjack() {
		//pass by value primitive 
		return getHandValue() == 21;
	}
	
	public boolean typeBust() {
		return getHandValue() > 21;
	}
	
	
	
	
}
