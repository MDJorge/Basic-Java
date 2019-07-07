import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Deck
{
	private ArrayList<Card> theDeck;
	private Random rand;
	/**
	 * Construct a standard deck based on the SUITS and VALUES
	 * from the Card class.
	 */
	public Deck()
	{
		theDeck = new ArrayList<Card>();
		rand = new Random();
		
		for(int suit = 0; suit < Card.SUITS.length; suit++)
		{
			for(int value = 0; value < Card.VALUES.length; value++)
			{
				this.theDeck.add(new Card(suit, value));
			}
		}
	}
	
	/**
	 * Shuffle the deck once in a pseudo random way.
	 */
	public void shuffle()
	{
		ArrayList<Card> topHalf = new ArrayList<Card>();
		
		int cutPoint = this.randomCutPoint();
		
		for(int i = 0; i < cutPoint && !theDeck.isEmpty(); i++)
		{
			topHalf.add(this.deal());
		}
		
		ArrayList<Card> bottomHalf = new ArrayList<Card>();
		Iterator<Card> it = theDeck.iterator();
		while(it.hasNext())
		{
			bottomHalf.add(it.next());
		}
		
		theDeck.clear();
		
		Iterator<Card> topIt = topHalf.iterator();
		Iterator<Card> botIt = bottomHalf.iterator();
		
		while(topIt.hasNext() || botIt.hasNext())
		{
			if(topIt.hasNext() && rand.nextInt(2) == 0)
				theDeck.add(topIt.next());
			if(botIt.hasNext() && rand.nextInt(2) == 0)
				theDeck.add(botIt.next());
		}
	}
	
	public void riffleShuffle()
	{
		ArrayList<Card> topHalf = new ArrayList<Card>();
		
		int cutPoint = this.randomCutPoint();
		
		for(int i = 0; i < cutPoint && !theDeck.isEmpty(); i++)
		{
			topHalf.add(this.deal());
		}
		
		Iterator<Card> it = topHalf.iterator();
		while(it.hasNext())
		{
			this.putInRandomly(it.next());
		}
	}
	
	/**
	 * Select a random cut point in the interior of the deck.
	 * @return
	 */
	public int randomCutPoint()
	{
		int cutPoint = (theDeck.size() / 2) + (rand.nextInt(theDeck.size()) - (theDeck.size() / 2));
		
		//System.err.println("Chose " + cutPoint + " as random cut point.");
		
		if(cutPoint < 0 || cutPoint >= theDeck.size())
		{
			cutPoint = theDeck.size() / 2;
		}
		
		return cutPoint;
	}
	
	public boolean isEmpty()
	{
		return theDeck.isEmpty();
	}
	
	/**
	 * Deal one card from the deck.
	 * Dealt card is removed from the deck.
	 * @return the dealt card.
	 */
	public Card deal()
	{
		return theDeck.remove(0);
	}
	
	/**
	 * Put the given card on the bottom of the deck.
	 * @param card
	 */
	public void putOnBottom(Card card)
	{
		theDeck.add(theDeck.size(), card);
	}
	
	/**
	 * Put the card randomly into the deck.
	 * @param card
	 */
	public void putInRandomly(Card card)
	{
		int randomPlace = rand.nextInt(theDeck.size() + 1);
		theDeck.add(randomPlace, card);		
	}
	
	/**
	 * Put the given card on the top of the deck.
	 * @param card
	 */
	public void putOnTop(Card card)
	{
		theDeck.add(card);
	}
}
