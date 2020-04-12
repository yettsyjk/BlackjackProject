package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//using an array of Card objects
  private List<Card> cards;

  public Deck() {
    cards = createDeck();
    shuffle();
  }
  
  
  public List<Card> dealingCards(int numberOfCards, List<Card> hand) {
	 //fresh deck of cards, no card dealt yet
	  for(int currentCard = 0; currentCard  < numberOfCards; currentCard++) {
		  if(cards.size() != 0 ) {
			  hand.add(dealCard());
		  }
	  }
	  //must return a card object
	  return hand;
  }
  
  
  
  private List<Card> createDeck(){
	  //each deck has a limit of 52 elements within the ArrayList
    List<Card> deck = new ArrayList<>(52);
    for(Suit suits : Suit.values()) {
      for(Rank ranks : Rank.values()) {
        deck.add(new Card(ranks, suits));
      }
    }
    return deck;
  }
  
  public int checkDeckSize() {
    return 52 - cards.size();
  }
  //return void type as it doesn't return a value
  //someone has to tell the deck to shuffle, go to dealer
  public void shuffle() {
	  //order must be random, effect on state of the cards in the deck
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
