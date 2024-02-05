public enum Suit {
    CLUB("\u2663"), SPADE("\u2660"), HEART("\u2665"), DIAMOND("\u2666");

    private final String unicode;


    Suit(String unicode) {
        this.unicode = unicode;
    }
}
