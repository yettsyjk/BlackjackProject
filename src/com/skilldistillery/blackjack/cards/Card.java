package com.skilldistillery.blackjack.cards;

public class Card {
	private Rank rank;
	private Suit suit;

	public Card(Rank rank, Suit suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}
	
	public Card() {
	}
	
	public Rank getRank() {
		return rank;
	}
	
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	

	public int getValue() {
		return rank.getValue();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (rank != other.rank)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		//return "Card [Rank = " + rank + ", Suit = " + suit + ", Value = " + rank.getValue() + " ] ";
		builder.append(" ");
		builder.append(rank.getValue());
		
		builder.append(" of ");
		if(suit == Suit.CLUBS) {
			builder.append("♧");
		}
		else if(suit == Suit.DIAMONDS) {
			builder.append("♢");
		}
		else if(suit == Suit.SPADES) {
			builder.append("♤");
		}
		else if(suit == Suit.HEARTS) {
			builder.append("♡");
		}
		return builder.toString();
		
	
	
	}
	
	

}
