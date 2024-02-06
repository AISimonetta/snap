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

    // to display visually the card
    @Override
    public String toString() {
        return String.format(
                "                \n"
                        + "  " + this.stringSymbol + "           \n"
                        + "  " + this.suit.getUnicode() + "            \n"
                        + "               \n"
                        + "       " + this.suit.getUnicode() + "       \n"
                        + "               \n"
                        + "            " + this.suit.getUnicode() + " \n"
                        + "            " + this.stringSymbol + " \n"
                        + "                \n"
        );
    }
}