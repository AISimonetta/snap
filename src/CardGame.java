import javax.swing.*;
import java.util.ArrayList;

public class CardGame {
    //STAGE 1
    //    Contains an ArrayList<Card> for the deckOfCards that contains all 52 cards. This is created and populated when the game is
//    constructed.
//    Has a name which is also defined in the constructor.
//    Has a getDeck method that lists out the cards in the deck.

    //STAGE 2
//    Lets get some core functionality to our CardGame by implementing the following methods:
//    Card dealCard()
//    Takes the card from the top of the deck and returns it.
//    ArrayList<Card> sortDeckInNumberOrder()
//    Sorts the deck in number order (e.g. 2222333344445555 etc) and stores the new shuffled deck back into the deckOfCards attribute.
//            ArrayList<Card> sortDeckIntoSuits()
//    Sorts the deck into suits (2,3,4,5,6,7,8,9,10,J,Q,K,A of hearts, then 2,3,4,5,6,7,8,9,10,J,Q,K,A of clubs etc.) and stores the new shuffled
//    deck back into the deckOfCards attribute.
//    ArrayList<Card> shuffleDeck()
//    Shuffles the deck into a random order and stores the new shuffled deck back into the deckOfCards attribute.
    ArrayList<Card> deckOfCards = new ArrayList<>();
    private String name ;

    public void getDeck() {

    }

}
