package com.skilldistillery.blackjack.players;

import java.util.List;

import com.skilldistillery.blackjack.cards.Card;
import com.skilldistillery.blackjack.cards.Deck;
import com.skilldistillery.blackjack.hand.BlackjackHand;

public class BlackjackDealer extends BlackjackPlayer{
	private Deck deck = new Deck();
	//hand has access through deck of cards
	private BlackjackHand hand = new BlackjackHand();
	
	
	public BlackjackDealer() {
		super();
		//inheriting private List<Card> cards; and access to shuffle
		deck.shuffle();
	}
	
	public void dealOneCardToPlayer(BlackjackPlayer player) {
		System.out.println(  deck.dealingCards(2, player.getHand().getCards())  );
	}
	
	public void dealOneCardToDealer() {
		System.out.println(   deck.dealingCards(1, hand.getCards())     );
	}
	
	public boolean casinoHand() {
		if(hand.getHandValue() >= 17 && hand.getHandValue() <= 21  ) {
			return true;
		}
		return false;
	}
	
	
	public void hit() {
		hand.addCard(deck.dealCard());
	}
	
	public BlackjackHand getHand() {
		//pass by value Object clone
		return hand;
	}
	
	public void hit(BlackjackPlayer player) {
		player.getHand().addCard(deck.dealCard());
	}
}
