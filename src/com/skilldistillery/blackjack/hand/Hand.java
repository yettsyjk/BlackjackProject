package com.skilldistillery.blackjack.hand;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.blackjack.cards.Card;

public abstract class Hand {
	
	private List<Card> cards;
	//private data encapsulated requires get() and set()
	
	//constructor
	public Hand() {
		cards = new ArrayList<>();
	}
	
	public abstract int getHandValue();

	//get
	public List<Card> getCards() {
		return cards;
	}

	//set
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	
	public void addCard(Card card) {
		getCards().add(card);
	}
	
	public void clear() {
		cards = new ArrayList<>();
	}
	
	public void clearHand() {
		cards.removeAll(cards);
	}

	@Override
	public String toString() {
		return "Hand [ cards = " + cards + " ] ";
	}
	
	
	
	
}
