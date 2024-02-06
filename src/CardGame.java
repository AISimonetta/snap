import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CardGame {

    ArrayList<Card> deckOfCards = new ArrayList<>();
    private String name;

    //Methods

    //Create  card with a suit and symbol
    public  void createDeck() {
        for (Suit suit : Suit.values()) {
            for (StringSymbol stringSymbol : StringSymbol.values()) {
                deckOfCards.add(new Card(suit, stringSymbol));
            }
        }
    }

    //Takes the card from the top of the deck and returns it.
    public Card dealCard(ArrayList<Card> deckOfCards) {
        return  deckOfCards.remove(0);
    }

    //Sorts the deck in number order and stores the new shuffled deck back into the deckOfCards attribute.
    public ArrayList<Card> sortDeckInNumberOrder() {
        Collections.sort(deckOfCards, (cardOne, cardTwo) -> cardOne.getValue() - cardTwo.getValue());
        return deckOfCards;
    }

    //Sorts the deck into suits and stores the new deck back into the deckOfCards attribute.
    public ArrayList<Card> sortDeckIntoSuits() {
        Collections.sort(deckOfCards, (a, b) -> a.getValue()- b.getValue());
        return deckOfCards;
    }

    //Shuffles the deck into a random order and stores the new shuffled deck back into the deckOfCards.
    public ArrayList<Card> shuffleDeck() {
        Collections.shuffle(deckOfCards, new Random());
        return deckOfCards;
    }

    //Lists out the cards in the deck.
    public void getDeck() {
        for (Card card : deckOfCards) {
            System.out.println(card);
        }
    }
}