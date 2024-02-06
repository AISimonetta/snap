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
        boolean snapMatchingCards = false;
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Hi! My name is Alex, welcome to SNAP game");
        String playerTwo = snap.getPlayerName();
        createDeck();
        shuffleDeck();

        if (deckOfCards.size() >= 2) {
            Card cardPlayerOne = dealCard(deckOfCards);
            Card cardPlayerTwo = dealCard(deckOfCards);
            System.out.println(playerOne + "-> My card is:" + cardPlayerOne  );
            System.out.println(playerTwo + "-> Your card is: " + cardPlayerTwo);

            if (cardsMatch(cardPlayerOne, cardPlayerTwo)) {
                snapMatchingCards = true;
                saySnap();
            }
        }

        if (!snapMatchingCards && deckOfCards.size() >= 2) {
            System.out.println("Cards do not match.. NEXT ROUND!");
        }
    }

    private boolean cardsMatch(Card cardOne, Card cardTwo) {
        return cardOne.getStringSymbol() == cardTwo.getStringSymbol();
    }

    private void getPlayerTwoName() {
        UserInteraction userInteraction = new UserInteraction();
        String playerTwo = userInteraction.getPlayerName();
    }

    public void saySnap() {
        System.out.println("SNAP!");
    }
}