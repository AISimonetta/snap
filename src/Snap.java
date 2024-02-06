import java.sql.SQLOutput;

public class Snap extends CardGame {

    // variables
    private String playerOne = "Alex";
    private String playerTwo;

    // Constructor
    public Snap(String playerTwo) {
        this.playerTwo = playerTwo;
    }

    //Methods:

    public void playGame() {
        UserInteraction snap = new UserInteraction();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Hi! My name is Alex, welcome to SNAP game");
        String playerTwo = snap.getPlayerName();

        boolean snapMatchingCards = false;
        Card currentCard = dealCard();
        Card lastCard = null;
        createDeck();
        shuffleDeck();

        if (deckOfCards.size() >= 2) {

    }

    private boolean cardsMatch(currentCard, currentCard) {
        return currentCard.getStringSymbol().equals.currentCard.getStringSymbol();
    }


    public void saySnap() {
        System.out.println("SNAP!");
    }
}