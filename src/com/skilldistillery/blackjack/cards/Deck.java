package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  private List<Card> cards;

  public Deck() {
    cards = createDeck();
    shuffle();
  }
  
  
  public List<Card> dealingCards(int numberOfCards, List<Card> hand) {
	  for(int card = 0; card < numberOfCards; card++) {
		  if(cards.size() != 0 ) {
			  hand.add(dealCard());
		  }
	  }
	  return hand;
  }
  
  
  
  private List<Card> createDeck(){
    List<Card> deck = new ArrayList<>(52);
    for(Suit suits : Suit.values()) {
      for(Rank ranks : Rank.values()) {
        deck.add(new Card(ranks, suits));
      }
    }
    return deck;
  }
  
  public int checkDeckSize() {
    return cards.size();
  }
  //someone has to tell the deck to shuffle, go to dealer
  public void shuffle() {
    Collections.shuffle(cards);
  }
  
  @Override
  public String toString() {
	  return "Deck of Cards: [" + cards+ " ]";
  }
  
  public Card dealCard() {
	  if(cards.size() == 0) {
		  createDeck();
		  shuffle();
	  }
    return cards.remove(0);
  }
  
}
