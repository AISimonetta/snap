public enum StringSymbol {
    //Enum Constants with values
    TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9 "), TEN("10"), JACK("J"), QUEEN("Q"), KING("K"), ACE("A");

    private final String value;

    //Constructor
    StringSymbol(String value) {
        this.value = value;

    }

    //Method
    //to return value of enum ex"K"
    public String toString() {
        return this.value;
    }
}