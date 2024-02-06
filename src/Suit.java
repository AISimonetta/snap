public enum Suit {
    //Variables
    CLUB("\u2663", "black"), SPADE("\u2660", "black"), HEART("\u2665", "red"), DIAMOND("\u2666", "red");

    private final String unicode;
    private final String colour;

    //Constructor
    Suit(String unicode, String colour) {
        this.unicode = unicode;
        this.colour = colour;
    }

    //Getters
    public String getUnicode() {
        return unicode;
    }

    public String getColour() {
        return colour;
    }
}