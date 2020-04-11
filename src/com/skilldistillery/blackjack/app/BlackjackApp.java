package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.cards.Deck;
import com.skilldistillery.blackjack.hand.BlackjackHand;
import com.skilldistillery.blackjack.players.BlackjackDealer;
import com.skilldistillery.blackjack.players.BlackjackPlayer;

public class BlackjackApp {

	private BlackjackHand hand;
	private Deck deck = new Deck();
	private BlackjackPlayer player = new BlackjackPlayer();
	private BlackjackDealer dealer = new BlackjackDealer();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();
		app.launchBlackjack();

	}

	private void launchBlackjack() {
		boolean keepGoing = true;
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("|       Welcome to Arium Resort & Casino       |");
			System.out.println("|          Blackjack VIP Table                 |");
			System.out.println("-----------------------------------------------");
			dealer.dealOneCardToDealer();
			System.out.println("        Dealer Dealing to House                ");
			System.out.println("-----------------------------------------------");
			System.out.println("        Dealer Dealing to Player               ");
			dealer.dealOneCardToPlayer(player);
			System.out.println("-----------------------------------------------");

			showPlayerHand();
			showDealerHand();
			
			//logic for who is winning
			if(player.getHand().getHandValue() == 21 ) {
				System.out.println("***************************");
				System.out.println("Player Wins... BLACKJACK!!!");
				System.out.println("***************************");
	
			}
			if(dealer.typeBlackjack() ) {
				System.out.println("***************************");
				System.out.println("House Wins... BLACKJACK!!!!");
				System.out.println("***************************");
			}
			gameLogic();
			resetDeck();
			System.out.println();
			
			
			System.out.println("Play Again Press Y\n N to Quit");
			String choiceToKeepPlaying = sc.next();
			if (choiceToKeepPlaying.equalsIgnoreCase("N")) {
				System.out.println("VIP Table Thanks You for Spending Your Money With Aria Resort & Casino");
				keepGoing = false;
			}
		} while (keepGoing);

	}

	public void showPlayerHand() {
		int userChoice = 0;

		do {
			System.out.println("------------------------------------------------");
			System.out.println("|Player Hand Value:" + player.getHandTotal()+"\t\t\t\t|");
			System.out.println("| 1) Hit (Press 1)                             |");
			System.out.println("| 2) Stand (Press 2)                           |");
			System.out.println("------------------------------------------------");
			userChoice = sc.nextInt();
			switch (userChoice) {
			case 1:
				dealer.hit(player);
				break;
			case 2:
				break;
			default:
				System.out.println("--------------------------------------");
				System.out.println("1) Hit (Press 1) \n 2) Stand (Press 2)");
				System.out.println("--------------------------------------");
				break;
			}
			
		} while (player.getHandTotal() < 21 && userChoice != 2);
		System.out.println("Player Hand Value: " + player.getHandTotal());
		System.out.println();
		
		
		if(player.typeBust()) {
			System.out.println("================================");
			System.out.println("|      PLAYER ... BUST!        |");
			System.out.println("================================");
		}
	}
	
	
	public void gameLogic() {
		if(player.getHand().getHandValue() == 21) {
			System.out.println("******************************");
			System.out.println("*		PLAYER BLACKJACK	 *");
			System.out.println("******************************");
		}
		//////////
		if(player.typeBust() ) {
			System.out.println("************************");
			System.out.println("*     House Wins       *");
			System.out.println("************************");
		}
		if(player.typeBlackjack() ) {
			System.out.println("Player Wins.. BLACKJACK!!");
		}
		if(dealer.typeBust()) {
			System.out.println("Player Wins.. BLACKJACK!!");
		}
		if(dealer.getHand().getHandValue() > player.getHand().getHandValue() && dealer.getHand().getHandValue() <= 21) {
			System.out.println("*****************************");
			System.out.println("*       House Wins 	        *");
			System.out.println("*****************************");
		}
		if(player.getHand().getHandValue() > dealer.getHand().getHandValue() && !player.typeBust()) {
			System.out.println("**************************");
			System.out.println("*      Player Wins       *");
			System.out.println("**************************");
		}
		if(dealer.getHand().getHandValue() == player.getHand().getHandValue() && !dealer.typeBust() && !player.typeBust()) {
			System.out.println("==========================");
			System.out.println("|      		DRAW         |");
			System.out.println("==========================");
		}
		
	}

	public void showDealerHand() {
		// while dealer hand value is less than 17 based off user story allow dealer to
		while(dealer.getHand().getHandValue() < 17 ) {
			// hit
			dealer.hit();
		}
		
		System.out.println("House Hand Value: " + dealer.getHand().getHandValue() );
		System.out.println(" ");
		// if dealer hand value is larger than 17 based off user story the dealer has
		if(dealer.getHand().typeBust() ) {
			System.out.println("***************************");
			System.out.println("*     House ... BUST!     *");
			System.out.println("***************************");
		}
		// game over
	}

	public void resetDeck() {
		// allow dealer to clear deck
		dealer.getHand().clear();

		// allow player to clear deck
		player.getHand().clear();
	}

}
