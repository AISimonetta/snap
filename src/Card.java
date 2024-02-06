public class Card {

    private Suit suit;
    private StringSymbol stringSymbol;
    private int value;

    // default constructor:
    public Card(Suit suit, StringSymbol stringSymbol) {
        this.suit = suit;
        this.stringSymbol = stringSymbol;
    }

    // constructor
    public Card(Suit suit, StringSymbol stringSymbol, int value) {
        this.suit = suit;
        this.stringSymbol = stringSymbol;
        this.value = value;
    }

    // getters
    public Suit getSuit() {
        return suit;
    }

    public StringSymbol getStringSymbol() {
        return stringSymbol;
    }

    public int getValue() {
        return value;
    }

    // to display visually the card and with some colour using ANSI codes
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