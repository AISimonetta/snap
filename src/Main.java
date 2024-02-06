public class Main {
    public static void main(String[] args) {
        Snap snap = new Snap("PlayerTwo");
        UserInteraction userInteraction = new UserInteraction();
        do {
            snap.playGame();
        } while (userInteraction.playAgain());
    }
}
