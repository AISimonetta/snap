import java.util.ArrayList;

public class Card {

    // Instructions
    // Has a String suit. Use the unicode characters of heart, club, diamond, and spade.
    // Has a String symbol (2,3,4,5,6,7,8,9,10,J,Q,K,A)
    // Has an int value (2,3,4,5,6,7,8,9,10,11,12,13,14)
    // Has a toString method that describes the class

    private Suit suit;
    private StringSymbol stringSymbol;
    private int value;

    //Default constructor:
    public Card(Suit suit, StringSymbol stringSymbol) {
    }
    // Constructor
    public Card(Suit suit, StringSymbol stringSymbol, int value) {
        this.suit = suit;
        this.stringSymbol = stringSymbol;
        switch (stringSymbol) {
            case TWO:
                this.value = 2;
                break;
            case THREE:
                this.value = 3;
                break;
            case FOUR:
                this.value = 4;
                break;
            case FIVE:
                this.value = 5;
                break;
            case SIX:
                this.value = 6;
                break;
            case SEVEN:
                this.value = 7;
                break;
            case EIGHT:
                this.value = 8;
                break;
            case NINE:
                this.value = 9;
                break;
            case TEN:
                this.value = 10;
                break;
            case JACK:
                this.value = 11;
                break;
            case QUEEN:
                this.value = 12;
                break;
            case KING:
                this.value = 13;
                break;
            case ACE:
                this.value = 14;
                break;
        }
    }



    // Getters
    public Suit getSuit() {
        return suit;
    }

    public StringSymbol getStringSymbol() {
        return stringSymbol;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return suit + " " + stringSymbol + " " + value;
    }
}