package com.skilldistillery.blackjack.app;

import java.util.Scanner;

public class BlackjackApp {

	
	Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();
		GamePlay game = new GamePlay();
		game.run();

	}
	
	
}
