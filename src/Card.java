public class Card {
    // Variables
    private Suit suit;
    private StringSymbol stringSymbol;
    private int value;

    //Default constructor:
    public Card(Suit suit, StringSymbol stringSymbol) {
        this.suit = suit;
        this.stringSymbol = stringSymbol;
    }

    //Constructor
    public Card(Suit suit, StringSymbol stringSymbol, int value) {
        this.suit = suit;
        this.stringSymbol = stringSymbol;
        this.value = value;
    }

    //Getters
    public Suit getSuit() {
        return suit;
    }

    public StringSymbol getStringSymbol() {
        return stringSymbol;
    }

    public int getValue() {
        return value;
    }

    // Displays visually the card with some colour on it by using ANSI codes
    @Override
    public String toString() {
        String colorString = suit.getColour().equals("red") ? "\u001B[31m" : "\u001B[30m";

        return String.format(
                "                \n"
                        + "  " + colorString + this.stringSymbol + "          \n"
                        + "  " + colorString + this.suit.getUnicode() + "           \n"
                        + "               \n"
                        + "       " + colorString + this.suit.getUnicode() + "      \n"
                        + "               \n"
                        + "           " + colorString + this.suit.getUnicode() + " \n"
                        + "           " + colorString + this.stringSymbol + " \n"
                        + "               \n"
                        + "\u001B[0m" // Reset ANSI color code
        );
    }
}