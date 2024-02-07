import java.util.Scanner;

public class Snap extends CardGame {

    // variables
    private final String playerOne = "Alex";
    private final String playerTwo;

    // Constructor
    public Snap(String playerTwo) {
        this.playerTwo = playerTwo;
    }

    // Methods:
    public void playGame() {
        UserInteraction user = new UserInteraction();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Hi! My name is Alex, welcome to SNAP card game");
        String playerName = user.getPlayerName();
        String playerTwo = playerName;

        createDeck();
        sortDeckInNumberOrder();
        sortDeckIntoSuits();
        shuffleDeck();

        boolean snapMatchingCards = false;
        Card lastCard = null;

        while (deckOfCards.size() >= 2) {

            // PlayerOne turn
            Card cardPlayerOne = dealCard(deckOfCards);
            System.out.println(playerOne + " -> My card is: " + cardPlayerOne);
            // Check if the cards match comparing cardPlayerOne with the last card which
            //would be the one from player2 in the next round.
            if (snapMatchingCards(cardPlayerOne, lastCard)) {
                snapMatchingCards = true;
                saySnap();
                break;
            }
            // Saving the last card for the next comparison
            lastCard = cardPlayerOne;


            // PlayerTwo turn
            user.userTurn();
            Card cardPlayerTwo = dealCard(deckOfCards);
            System.out.println(playerTwo + " -> Your card is: " + cardPlayerTwo);
            // Check if the cards match
            if (snapMatchingCards(cardPlayerTwo, lastCard)) {
                snapMatchingCards = true;
                saySnap();
                break;
            }
            // Saving the last card for the next comparison
            lastCard = cardPlayerTwo;

        }

        if (!snapMatchingCards) {
            System.out.println("Game over!");

        }
    }

    //Compare cards with each other .If null is because there is no card to compare, if both conditions T, return T .
    private boolean snapMatchingCards(Card cardOne, Card cardTwo) {
        return cardTwo != null && cardOne.getStringSymbol().equals(cardTwo.getStringSymbol());
    }

    //If cards match, game ends with SNAP!
    private void saySnap() {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(" * * * * * * * * * * * * * * * * * * * S N A P ! * * * * * * * * * * * * * * * * * * * *");
        System.out.println("----------------------------------------------------------------------------------------");
    }
}
