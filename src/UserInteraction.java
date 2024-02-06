import javax.swing.*;
import java.util.Scanner;
public class UserInteraction {
    private Scanner scanner = new Scanner(System.in);

        //Methods
        public String getPlayerName() {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("* Please enter your name: ");
            String playerName = scanner.nextLine();
            return playerName;
        }

        public void userTurn() {
            System.out.println("* Please press ENTER, It's your turn!");
            scanner.nextLine();
        }

        public boolean playAgain() {
            System.out.println("* Would you like to play again? ( 0 for No, 1 for Yes): ");
            boolean chooseToPlayAgain = scanner.nextInt() == 1;
            if (chooseToPlayAgain) {
                return true;
            } else {
                return false;
            }
        }
}

