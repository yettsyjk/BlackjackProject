# Blackjack Project

- Created by Software Developer Yettsy Jo Knapp. Denver, CO.
## Application Overview
  - Use classes to create a functional command line blackjack game, using Java.
  - Implement methods and fields to store data you think you would need during a blackjack game.

## UML Diagram
    - See UML Diagram in src directory
## User Story #1
  - Create a class structure that mimics a deck of cards. Remember decks as well as hands are made up of cards. Feel free to create the structure in any way you see fit.

  - Your card and deck implementations should NOT be coupled to Blackjack; you should be able to reuse them to implement a poker or bridge game application.

## User Story #2
  - Add methods and fields to your classes that mimic the functionality of shuffling and dealing a deck of cards. Remember that when a card is dealt you have to remove it from the current deck. You should be able to print out a shuffled deck to the terminal.

## User Story #3
  - Deal two hands of cards - one to a Dealer and another to a Player. Allow the players to Hit (add cards to their hand) or Stay (not add cards to their hand) in accordance to the rules of blackjack.

  - Do not worry about the multiple values for Ace until your basic game logic is working. Assume they are either 1 or 11 to start.

## User Story #4
  - The Dealer's decisions are based on game logic in the program.
  - The Dealer must decide to Hit or Stay based on the rules of Blackjack: if the Dealer's hand total is below 17, the Dealer must Hit; if the hand total is 17 or above, the Dealer must Stay.

## User Story #5
  - Determine the winner of each round by implementing the remaining rules of Blackjack (such as going over 21) and comparing hand values.

## Lessons Learned:
1. Object-oriented programming: Wrapping my head around every class in Java is an object and knowing how to work with objects in specific class and the available methods.
1. Methods in classes and knowing how to access the specific method when needed. Also when to remove methods that no longer serve their purpose due to new methods.
1. Working with values in enum class for Rank and for Suit objects
1. I used many conditional statements for game logic and testing each conditional properly during runtime. I feel that this code wasn't very DRY and efficient but, that's why I'm in this course to help me become more efficient and clean up my code structure.
1. Object-oriented concepts are starting to make sense while working remotely. These concepts are especially tough for me to visualize. However, due to COVID19 and having to use zoom meetings for our course training I could review the videos on some of the pieces that initially didn't make sense. This is still a struggle and hope to solidify my understanding with further doc review.

### Technologies Used:
1. Git
1. GitHub version control
1. Java
1. Eclipse IDE
1. Terminal CLI
1. UML Diagram - ObjectAid plugin in Eclipse IDE
1. Zoom Video Conference

## MVP
  - Design OO Class structure, program must not be contained in main.
  - When the game begins both the player and dealer are dealt two cards.
  - If a player or dealer is dealt 21 the game is over. Otherwise the player can choose to hit as many times as they wish until they choose to stay.

## Copyright (c)2020 Yettsy Knapp
 - Let's Connect on [LinkedIn](https://www.linkedin.com/in/yettsy-jo-knapp)
