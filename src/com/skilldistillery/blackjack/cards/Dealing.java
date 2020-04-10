package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealing {
	
	private Deck deck;
	private Scanner sc;
	Dealing app = new Dealing();
	
	
	public void runDealing() {
		deck = new Deck();
		deck.shuffle();
		
		List<Card> playerHand = new ArrayList<>();
		sc = new Scanner(System.in);
		
		System.out.println("Enter the number of cards: (Between 1 - 52)");
		try {
			int numberOfCards = sc.nextInt();
			while(numberOfCards > 52 || numberOfCards == 0) {
				System.out.println("Please Enter Number of Cards (between 1 to 52)");
				numberOfCards = sc.nextInt();
			}
			for(int userInput = 0; userInput < numberOfCards; userInput++) {
				playerHand.add(deck.dealCard());
			}
			int valueOfHand = 0;
			for(Card card : playerHand) {
				System.out.println(card);
				valueOfHand += card.getValue();
			}
			System.out.println("The value of the Hand is "+ valueOfHand);
		} catch(Exception e) {
			System.err.println(e.getMessage()+ " Invalid Input");
		}
	}

}
